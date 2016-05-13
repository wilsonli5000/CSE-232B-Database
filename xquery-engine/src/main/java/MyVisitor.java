package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import src.main.java.antlr.XqueryBaseVisitor;
import src.main.java.antlr.XqueryParser;
import sun.awt.image.ImageWatched;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * Created by wilsonli on 5/10/16.
 */
public class MyVisitor extends XqueryBaseVisitor<Object> {

    /* use this stack to store the context for pass */
    private LinkedList<Contex> stack = new LinkedList<Contex>();
    private Map<String, Node> varList = new HashMap(); //Map from variable(String) to Node
    private LinkedList<Node> emp = new LinkedList<Node>(); //Empty list of node, default return value
    public LinkedList<Node> output = new LinkedList<Node>();; //Store result, mainly update at return clause


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
        current.printContex();
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
        for (Node node : stack.peek().getChildNodes())
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
        Contex.printNodeList(current.getChildNodes());
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

    // Modified Part 2: XQuery Override

    @Override public Object visitXQVariable(XqueryParser.XQVariableContext ctx) {
        System.out.println("XQ Variable");
        String varname = ctx.var().NAME().getText();
        LinkedList<Node> temp = new LinkedList<Node>();
        temp.add(varList.get(varname));
        return temp; }

    @Override public Object visitXQAp(XqueryParser.XQApContext ctx) {
        System.out.println("XQ Ap");
        LinkedList<Node> res = (LinkedList<Node>) visit(ctx.ap());
        return res; }

    @Override public Object visitXQWithPar(XqueryParser.XQWithParContext ctx) {
        System.out.println("XQ with par");
        return visit(ctx.xq()); }

    @Override public Object visitFLWR(XqueryParser.FLWRContext ctx) {
        // Read variable name and XQuery from forClause
        /*
        System.out.println("forwhereletreturn -->");
        List<XqueryParser.VarContext> loopvar = ctx.forClause().var();
        int n = loopvar.size();
        System.out.println("n: " + n);
        int i, j;
        int[] sizelist = new int[n];
        int[] flaglist = new int[n];

        // Run each XQuery and get loop value for each variable
        LinkedList<LinkedList<Node>> loop = new LinkedList<LinkedList<Node>>();
        for (i = 0;i < n;i ++) {
            loop.add((LinkedList<Node>) visit(ctx.forClause().xq(i)));
            sizelist[i] = loop.get(i).size();
            flaglist[i] = 0;
        }
        //Loop until all combination of n variables traveled;
        while (true) {
            //Assign variable value
            for (i = 0;i < n;i ++) varList.put(loopvar.get(i).getText(), loop.get(i).get(flaglist[i]));
            //Run letClause if needed
            if (ctx.letClause() != null) visit(ctx.letClause());
            //Run whereClause

            if (ctx.whereClause() == null) visit(ctx.returnClause());
            else if ((Boolean)visit(ctx.whereClause()) == true) visit(ctx.returnClause());

            for (i = 0;i < n;i ++) {
                flaglist[i] += 1;
                if (flaglist[i] < sizelist[i]) break;
                flaglist[i] = 0;
            }
            j = 0;
            for (i = 0;i < n;i ++) {
                j += flaglist[i];
            }
            if (j == 0) break;
        }
        ctx.let */
        runFLWR(ctx.forClause().var(), ctx.forClause().xq(), ctx.letClause(), ctx.whereClause(), ctx.returnClause());
        return emp; }

    public Object runFLWR(List<XqueryParser.VarContext> varl, List<XqueryParser.XqContext> xql, XqueryParser.LetClauseContext l, XqueryParser.WhereClauseContext w, XqueryParser.ReturnClauseContext r){
        XqueryParser.VarContext currentvar = varl.get(0);
        XqueryParser.XqContext currentxq = xql.get(0);
        varl.remove(0);
        xql.remove(0);
        LinkedList<Node> varbuffer = (LinkedList<Node>) visit(currentxq);
        int i, n = varbuffer.size();
        String varname = currentvar.getText();
        System.out.println("Var: " + varname + " has " + n + " nodes.");
        if (varl.isEmpty()) {
            for (i = 0;i < n;i ++) {
                varList.put(varname, varbuffer.get(i));
                if (l != null) visit(l);
                if (w == null) visit(r);
                else if((Boolean) visit(w) == true) {
                    System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
                    visit(r);
                }
            }
        }
        else {
            for (i = 0; i < n; i++) {
                varList.put(varname, varbuffer.get(i));
                if (varname.equals("sc")) System.out.println("varl size: " + varl.size());
                runFLWR(varl, xql, l, w, r);
            }
        }
        varl.add(0, currentvar);
        xql.add(0, currentxq);
        return emp;
    }

    @Override public Object visitTwoXQ(XqueryParser.TwoXQContext ctx) {
        System.out.println("two xq");
        LinkedList<Node> res = new LinkedList<>();
        res.addAll((LinkedList<Node>) visit(ctx.xq(0)));
        res.addAll((LinkedList<Node>) visit(ctx.xq(1)));
        return res; }

    @Override public Object visitXQLet(XqueryParser.XQLetContext ctx) {
        System.out.println("XQ let");
        visit(ctx.letClause());
        return visit(ctx.xq()); }

    @Override public Object visitXQStrConst(XqueryParser.XQStrConstContext ctx) {
        System.out.println("XQ String Counst");
        Contex current = new Contex();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            String text = ctx.StringConstant().getText();
            int n = text.length();
            text = text.substring(1, n - 1);
            System.out.println("text: " + text);
            Node textNode = doc.createTextNode(text);
            current.add(textNode);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return current.getNode(); }

    @Override public Object visitXQRp(XqueryParser.XQRpContext ctx) {
        System.out.println("XQ RP / ");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.xq());
        Contex middle = new Contex();
        for (Node node : x)
            middle.add(node);
        stack.push(middle);
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> res = unique(y);
        stack.pop();
        return res; }

    @Override public Object visitXQRpAll(XqueryParser.XQRpAllContext ctx) {
        System.out.println("XQ RP // ");
        LinkedList<Node> x = (LinkedList<Node>) visit(ctx.xq());
        Contex current = new Contex();
        current.add(x);
        LinkedList<Node> descendents = current.getDescendents();
        Contex middle = new Contex();
        for (Node node : descendents) {
            middle.add(node);
        }
        stack.push(middle);
        LinkedList<Node> y = (LinkedList<Node>) visit(ctx.rp());
        LinkedList<Node> res = unique(y);
        stack.pop();

        return res; } // To be filled in

    @Override public Object visitXQTag(XqueryParser.XQTagContext ctx) {
        System.out.println("XQ <tag> </tag>");
        String tagName = ctx.NAME(0).getText();
        LinkedList<Node> res = (LinkedList<Node>) visit(ctx.xq());
        LinkedList<Node> ans = new LinkedList<>();
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Node tagNode = doc.createElement(tagName);
            for (Node node : res) {
                Node importedNode = doc.importNode(node, true);
                tagNode.appendChild(importedNode);
            }
            ans.add(tagNode);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ans; }

    @Override public Object visitVar(XqueryParser.VarContext ctx) {
        System.out.println("var");
        String varname = ctx.getText();
        LinkedList<Node> temp = new LinkedList<Node>();
        temp.add((Node) varList.get(varname));
        return temp;
    }

    @Override public Object visitForClause(XqueryParser.ForClauseContext ctx) {
        System.out.println("for clause");
        return emp;
    } //Only for clause make no scene

    @Override public Object visitLetClause(XqueryParser.LetClauseContext ctx) {
        System.out.println("let clause");
        List<XqueryParser.VarContext> varl = ctx.var();
        LinkedList<Node> temp;
        int i, n = varl.size();
        for(i = 0;i < n;i ++) {
            temp = (LinkedList<Node>) visit(ctx.xq(i));
            varList.put(varl.get(i).getText(), temp.get(0));
        }
        return emp; }

    @Override public Boolean visitWhereClause(XqueryParser.WhereClauseContext ctx) {
        System.out.println("where clause");
        return (boolean) visit(ctx.cond()); }

    @Override public Object visitReturnClause(XqueryParser.ReturnClauseContext ctx) {
        System.out.println("return clause");
        LinkedList<Node> rt = (LinkedList<Node>) visit(ctx.xq());
        output.addAll(rt);
        return emp; }

    @Override public Boolean visitXQCondEqual(XqueryParser.XQCondEqualContext ctx) {
        System.out.println("xq condition equal");
        LinkedList<Node> l0 = (LinkedList<Node>) visit(ctx.xq(0));
        LinkedList<Node> l1 = (LinkedList<Node>) visit(ctx.xq(1));
        int i0 = l0.size();
        int i1 = l1.size();
        if(i0 != i1) return false;
        for(int i = 0;i < i0;i ++) if (!l0.get(i).isEqualNode(l1.get(i))) return false;
        return true; }

    @Override public Boolean visitXQCondIs(XqueryParser.XQCondIsContext ctx) {
        System.out.println("xq condition is");
        LinkedList<Node> l0 = (LinkedList<Node>) visit(ctx.xq(0));
        LinkedList<Node> l1 = (LinkedList<Node>) visit(ctx.xq(0));
        int i0 = l0.size();
        int i1 = l1.size();
        if(i0 != i1) return false;
        for(int i = 0;i < i0;i ++) if (!l0.get(i).isSameNode(l1.get(i))) return false;
        return true; }

    @Override public Boolean visitXQCondAnd(XqueryParser.XQCondAndContext ctx) {
        return ((boolean) visit(ctx.cond(0)) & (boolean) visit(ctx.cond(1))); }

    @Override public Boolean visitXQCondNot(XqueryParser.XQCondNotContext ctx) {
        return !((boolean) visit(ctx.cond())); }

    @Override public Boolean visitXQCondEmpty(XqueryParser.XQCondEmptyContext ctx) {
        return ((LinkedList<Node>) visit(ctx.xq())).isEmpty(); }

    @Override public Boolean visitXQCondSome(XqueryParser.XQCondSomeContext ctx) {
        Map<String, Node> buffer = varList;
        List<XqueryParser.VarContext> varl = ctx.var();
        LinkedList<LinkedList<Node>> temp = new LinkedList<LinkedList<Node>>();
        int i, j, n = varl.size();
        int[] sizelist = new int[n];
        int[] flaglist = new int[n];
        for (i = 0;i < n; i ++) {
            temp.add((LinkedList<Node>) visit(ctx.xq(i)));
            sizelist[i] = temp.get(i).size();
            flaglist[i] = 0;
        }

        while (true) {
            for (i = 0;i < n;i ++) buffer.put(varl.get(i).getText(), temp.get(i).get(flaglist[i]));
            if ((boolean)visit(ctx.cond()) == true) return true;
            for(i = 0;i < n;i ++) {
                flaglist[i] += 1;
                if (flaglist[i] <= sizelist[i]) break;
                flaglist[i] = 0;
            }
            j = 0;
            for (i = 0;i < n;i ++) j += flaglist[i];
            if (j == 0) break;
        }

        return false; }

    @Override public Boolean visitXQCondOR(XqueryParser.XQCondORContext ctx) {
        return ((boolean) visit(ctx.cond(0)) | (boolean) visit(ctx.cond(1))); }

    @Override public Boolean visitXQCondWithPar(XqueryParser.XQCondWithParContext ctx) {
        return (boolean) visit(ctx.cond()); }


}
