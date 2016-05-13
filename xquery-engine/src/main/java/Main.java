package src.main.java;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import src.main.java.antlr.XqueryLexer;
import src.main.java.antlr.XqueryParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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
        String fname = args[0] + ".txt";
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
            //res = myVisitor.output;

            //writeXML(res,fname);
            DocumentBuilderFactory newFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder newBuilder = newFactory.newDocumentBuilder();
            Document newDoc = newBuilder.newDocument();
            Contex.printNodeList(res);
            newDoc = appendAllNodes(newDoc, res);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.setOutputProperty (OutputKeys.INDENT, "yes");
            Result output = new StreamResult(new File(args[0] + ".xml"));
            Source input = new DOMSource(newDoc);
            transformer.transform(input, output);

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static Document appendAllNodes(Document doc,  LinkedList<Node> nodeList){
        for (Node node : nodeList){
            System.out.println(node.getNodeName());
            Element root = treeWalker(doc, node);
            doc.appendChild(root);
        }
        return doc;
    }

    private static Element treeWalker(Document doc, Node node) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = doc.createElement(node.getNodeName());
            NodeList temp = node.getChildNodes();
            for (int i = 0; i < temp.getLength(); i++) {
                if (temp.item(i).getNodeType() == Node.TEXT_NODE) {
                    Node text = doc.createTextNode(node.getTextContent());
                    element.appendChild(text);
                } else element.appendChild(treeWalker(doc, temp.item(i)));
            }
            return element;
        }
        else{
            System.out.println("This should never happen");
        }
        return null;
    }
}