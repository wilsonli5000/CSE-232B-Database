package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.util.LinkedList;
import java.io.File;

/**
 * Created by wilsonli on 5/10/16.
 */
public class Contex{
    private LinkedList<Node> nodeList = new LinkedList<Node>();
    private Document rootFile;

    public Contex(Document doc){
        stack.add((Node) doc);
    }

    public int getLength(){
        return stack.size();
    }

    public Node getNode(){
        return stack.peek();
    }

    public LinkedList<Node> getParentNode(){
        // s singliton list with the parent node of n //
        LinkedList<Node> res = new LinkedList<Node>();
        res.add(stack.peek().getParentNode());
        return res;
    }

    public void setRootFile(Document doc){
        rootFile = doc;
    }

    public LinkedList<Node> getChildNodes() {
        System.out.println("get child of current contex");
        return null;
    }
}
