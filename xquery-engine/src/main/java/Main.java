package src.main.java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import src.main.java.antlr.XqueryLexer;
import src.main.java.antlr.XqueryParser;

import java.util.LinkedList;

/**
 * Created by wilsonli on 5/10/16.
 */
public class Main {

    public static String query = "document(\"test.xml\")//*";

    public static void main(String[] args) throws Exception{

        ANTLRInputStream inputStream = new ANTLRInputStream(query);
        XqueryLexer lexer = new XqueryLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        XqueryParser parser = new XqueryParser(tokenStream);
        // begin parsing at ap() rule //
        ParseTree tree = parser.ap();

        MyVisitor myVisitor = new MyVisitor();
        LinkedList<Node> res = (LinkedList<Node>) myVisitor.visit(tree);

        for (Node node : res) {
            System.out.println("returned nodes: " + node.getNodeName() + node.getTextContent());
        }

    }

}
