package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import src.main.java.antlr.XqueryBaseVisitor;
import src.main.java.antlr.XqueryParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;


/**
 * Created by wilsonli on 5/10/16.
 */
public class MyVisitor extends XqueryBaseVisitor<Object> {

    /* use this stack to store the context for pass */
    private LinkedList<Contex> stack = new LinkedList<Contex>();

    private static LinkedList<Node> unique(LinkedList<Node> nodeList){
        System.out.println("unique()-->");
        HashMap<Node, Boolean> hash = new HashMap<>();
        LinkedList<Node> res = new LinkedList<>();
        for (Node node : nodeList){
            if (!hash.containsKey(node)) {
                hash.put(node, true);
                res.add(node);
            }
        }
        return res;
    }

    @Override public Object visitAPChildren(XqueryParser.APChildrenContext ctx) {
        /*
            for rule [doc(fileName)/rp]A:
            get the root node, which is fname and pass it to rp
        */
        System.out.println("doc(\"fname\") / rp -->");
        String fn = (String) visit(ctx.fname());
        File xmlFile = new File(fn);
        // open the xml file //
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            Contex cur = new Contex();
            cur.add(doc);
            stack.push(cur);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return visit(ctx.rp());
    }

    @Override public Object visitAPAll(XqueryParser.APAllContext ctx) {
        // save the list of all child nodes of the current context into a new contex and then call rp().//
        System.out.println("doc(\"fname\") // rp -->");
        String fn = (String) visit(ctx.fname());
        File xmlFile = new File(fn);
        // open the xml file //
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            Contex cur = new Contex();
            cur.add(doc);
            stack.push(cur);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Contex current = stack.peek();
        Contex middle = new Contex();
        try {
            for (Node node : current.getNode()) {
                LinkedList<Node> descents = unique(current.getDescendents());
                for (Node subNode : descents) {
                    middle.add(subNode);
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        stack.push(middle);
        return visit(ctx.rp());
    }

    @Override public String visitFname(XqueryParser.FnameContext ctx) {
        System.out.println("fname -->");
        return ctx.getText();
    }

    @Override public Object visitAllChildren(XqueryParser.AllChildrenContext ctx) {
        /* children(ctx) return a list of children node of this node */
        System.out.println("rp[*] -->");
        Contex current = stack.peek();
        LinkedList<Node> res = new LinkedList<>();
        for (int i = 0; i < current.getLength(); i++){
            NodeList tmp = current.item(i).getChildNodes();
            for (int j = 0; j < tmp.getLength(); j++)
                res.add(tmp.item(j));
        }
        return res;
    }

    @Override public Object visitRPChildren(XqueryParser.RPChildrenContext ctx) {
        System.out.println("[rp / rp] -->");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.rp(0));
        Contex middle = new Contex();
        for (Node node : x)
            middle.add(node);
        stack.push(middle);
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp(1));
        LinkedList<Node> res = unique(y);
        stack.pop();
        return res;
    }

    @Override public Object visitRPwithPar(XqueryParser.RPwithParContext ctx) {
        System.out.println("rp[(rp)] -->");
        return visit(ctx.rp());
    }

    @Override public Object visitTagName(XqueryParser.TagNameContext ctx) {
        System.out.println("rp[tagName] -->");
        LinkedList<Node> res = new LinkedList<>();
        String tagName = (String) ctx.getText();
        for (Node node : stack.peek().getNode())
            if (tagName.equals(node.getNodeName()))
                res.add(node);
        return res;
    }

    // returns attribute node, if you want text, modify main function. //
    @Override public Object visitAttribute(XqueryParser.AttributeContext ctx) {
        System.out.println("rp[@attrName] -->");
        String attName = ctx.NAME().getText();
        Contex current = stack.peek();
        LinkedList<Node> res = new LinkedList<>();
        for (Node node : current.getNode()){
            res.add(node.getAttributes().getNamedItem(attName));
        }
        return res;
    }

    @Override public Object visitParent(XqueryParser.ParentContext ctx) {
        System.out.println("rp[..] -->");
        Contex current = stack.peek();
        return unique(current.getParentNode());
    }

    // i don;t think this works. //
    // returns text node, if you want text, modify main function. //
    @Override public Object visitText(XqueryParser.TextContext ctx) {
        System.out.println("rp[text()] -->");
        Contex current = stack.peek();
        return current.getChildNodes();
    }

    @Override public Object visitRPAll(XqueryParser.RPAllContext ctx) {
        System.out.println("[rp // rp] -->");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.rp(0));
        Contex current = new Contex();
        current.add(x);
        LinkedList<Node> descendents = current.getDescendents();
        Contex middle = new Contex();
        for (Node node : descendents) {
            middle.add(node);
        }
        stack.push(middle);
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp(1));
        LinkedList<Node> res = unique(y);
        stack.pop();

        return res;
    }

    @Override public Object visitCurrent(XqueryParser.CurrentContext ctx) {
        /*
            for rule [.]R(n)
            return the current node
         */
        System.out.println("rp[.] -->");
        Contex current = stack.peek();
        return current.getCurrentNode();
    }

    @Override public Object visitTwoRP(XqueryParser.TwoRPContext ctx) {
        System.out.println("[rp, rp] -->");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.rp(0));
        System.out.println(x.size());
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp(1));
        x.addLast(y.getFirst());
        System.out.println(x.size());

        return x;
    }

    @Override public Object visitRPCondition(XqueryParser.RPConditionContext ctx) {
        System.out.println("[rp[f]] -->");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> res = new LinkedList<>();
        try {
            for (Node node : x) {
                Contex current = new Contex();
                current.add(node);
                stack.push(current);
                if ((boolean) visit(ctx.fltr())) res.add(node);
                stack.pop();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return res;
    }

    @Override public Object visitFRPnot(XqueryParser.FRPnotContext ctx) {
        System.out.println("not f -->");
        return !(boolean)visit(ctx.fltr());
    }

    @Override public Object visitFRPwithPar(XqueryParser.FRPwithParContext ctx) {
        System.out.println("f[(f)] -->");
        return visit(ctx.fltr());
    }

    @Override public Object visitFRP(XqueryParser.FRPContext ctx) {
        System.out.println("f[rp] -->");
        LinkedList<Node> current = (LinkedList) visit(ctx.rp());
        return !current.isEmpty();
    }

    @Override public Object visitFRPequal(XqueryParser.FRPequalContext ctx) {
        System.out.println("f[rp = rp] -->");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.rp(0));
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp(1));
        boolean flag = false;
        for (Node node_x : x) {
            for (Node node_y : y) {
                flag = node_x.isEqualNode(node_y);
                if (flag) break;
            }
            if (flag) break;
        }
        return flag;
    }

    @Override public Object visitFRPis(XqueryParser.FRPisContext ctx) {
        System.out.println("f[rp == rp] -->");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.rp(0));
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp(1));
        boolean flag = false;
        for (Node node_x : x) {
            for (Node node_y : y) {
                flag = node_x.isSameNode(node_y);
                if (flag) break;
            }
            if (flag) break;
        }
        return flag;
    }

    @Override public Object visitFRPand(XqueryParser.FRPandContext ctx) {
        System.out.println("f[and] -->");
        boolean f1 = (boolean) visit(ctx.fltr(0));
        boolean f2 = (boolean) visit(ctx.fltr(1));
        return (f1 && f2);
    }

    @Override public Object visitFRPor(XqueryParser.FRPorContext ctx) {
        System.out.println("f[or] -->");
        boolean f1 = (boolean) visit(ctx.fltr(0));
        boolean f2 = (boolean) visit(ctx.fltr(1));
        return (f1 || f2);
    }


}
