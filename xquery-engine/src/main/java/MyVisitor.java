package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import src.main.java.antlr.XqueryBaseVisitor;
import src.main.java.antlr.XqueryParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;

/**
 * Created by wilsonli on 5/10/16.
 */
public class MyVisitor extends XqueryBaseVisitor<Object> {

    /* use this stack to store the context for pass */
    private LinkedList<Object> stack = new LinkedList<Object>();

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
            stack.push(doc);
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
        Contex current = new Contex();
        current.setRootFile((Document) stack.pop());
        return current.getChildNodes();
    }

    @Override public Object visitAllChildren(XqueryParser.AllChildrenContext ctx) {
        /* children(ctx) return a list of children node of this node */

        return visitChildren(ctx);
    }
}
