package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import src.main.java.antlr.XqueryBaseVisitor;
import src.main.java.antlr.XqueryParser;
import sun.awt.image.ImageWatched;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;

/**
 * Created by wilsonli on 5/10/16.
 */
public class MyVisitor extends XqueryBaseVisitor<Object> {

    /* use this stack to store the context for pass */
    private LinkedList<Contex> stack = new LinkedList<Contex>();

    @Override public Object visitAPChildren(XqueryParser.APChildrenContext ctx) {
        /*
            for rule [doc(fileName)/rp]A:
            get the root node, which is fname and pass it to rp
        */
        String fname = (String) visit(ctx.doc());
        File xmlFile = new File(fname);
        // open the xml file //
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            Contex cur = new Contex(doc);
            stack.push(cur);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return visit(ctx.rp());
    }


    @Override public Object visitAPAll(XqueryParser.APAllContext ctx) {
        /* get the  */

        return visit(ctx.rp());
    }

    @Override public String visitDoc(XqueryParser.DocContext ctx) {
        /* return the name string of the file name */
        return ctx.fname().getText();
    }

    @Override public Object visitCurrent(XqueryParser.CurrentContext ctx) {
        /*
            for rule [.]R(n)
            return the current node
         */
        Contex current = stack.peek();
        return current.getNode();
    }

    @Override public Object visitParent(XqueryParser.ParentContext ctx) {

        Contex current = stack.peek();
        return current.getParentNode();
    }

    @Override public Object visitAllChildren(XqueryParser.AllChildrenContext ctx) {
        /* children(ctx) return a list of children node of this node */
        NodeList current = (NodeList) stack.peek();
        LinkedList<Node> res = new LinkedList<>();
        for (int i = 0; i < current.getLength(); i++){
            for (int j = 0; j < current.item(i).getChildNodes().getLength(); j++)
                res.add(current.item(i).getChildNodes().item(j));
        }
        return res;
    }



    @Override public Object visitTagName(XqueryParser.TagNameContext ctx) {
        LinkedList<Node> res = new LinkedList<>();

        return visitChildren(ctx);
    }
}
