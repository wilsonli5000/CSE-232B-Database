package src.main.java;

import com.sun.tools.classfile.ConstantPool;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import src.main.java.antlr.XqueryLexer;
import src.main.java.antlr.XqueryParser;
import sun.awt.image.ImageWatched;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;

/**
 * Created by wilsonli on 5/10/16.
 */
public class Main {

    //public static String query = "for $x in document(\"test.xml\")/* where $x eq $x return $x";

    public static LinkedList<Node> removeEmptyTextNode(LinkedList<Node> nodeList){
        LinkedList<Node> res = new LinkedList<>();
        for (Node node : nodeList){
            if (!node.getNodeName().equals((String) "#text"))
                res.add(node);
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        String fname = "test_0.txt";
        File file = new File(fname);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            ANTLRInputStream inputStream = new ANTLRInputStream(fis);
            XqueryLexer lexer = new XqueryLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            XqueryParser parser = new XqueryParser(tokenStream);
            // begin parsing at ap() rule //
            ParseTree tree = parser.xq();

            MyVisitor myVisitor = new MyVisitor();
            LinkedList<Node> res = new LinkedList<>();
            res = (LinkedList<Node>) myVisitor.visit(tree);
            res = myVisitor.output;
            Contex result = new Contex();
            result.add(res);
            Contex.printNodeList(result.getDescendents());
            /*
            for (Node node : res) {
                System.out.println("\nreturned nodes: " + node.getNodeName() + "\ntext:" + node.getTextContent());
            }*/
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
