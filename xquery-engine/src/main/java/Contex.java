package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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

    public void add(Node unit){
        nodeList.add(unit);
    }

    public int getLength(){
        return nodeList.size();
    }

    public Node item(int i){
        return nodeList.get(i);
    }

    public Node getCurrentNode(){
        return nodeList.peek();
    }

    public LinkedList<Node> getParentNode(){
        // s singliton list with the parent node of n //
        LinkedList<Node> res = new LinkedList<Node>();
        for (int i = 0; i < nodeList.size(); i++){
            Node temp = nodeList.get(i);
            res.add(temp.getParentNode());
        }
        return res;
    }

    public LinkedList<Node> getChildNodes() {
        LinkedList<Node> res = new LinkedList<Node>();

        for (int i = 0; i < nodeList.size(); i++){
            NodeList temp = nodeList.get(i).getChildNodes();
            for (int j = 0; j < temp.getLength(); j++) {
                res.add(temp.item(j));
            }
        }
        return res;
    }
}
