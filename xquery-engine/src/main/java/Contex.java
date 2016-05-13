package src.main.java;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.awt.*;
import java.util.LinkedList;
import java.io.File;

/**
 * Created by wilsonli on 5/10/16.
 */
public class Contex{
    private LinkedList<Node> nodeList = new LinkedList<Node>();
    private LinkedList<Node> descendents = new LinkedList<Node>();
    private Document rootFile;

    public static void printNodeList(LinkedList<Node> list){
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Name: " + list.get(i).getNodeName() + "\tText: " + list.get(i).getTextContent() + "\n");
            }
        }
        else System.out.println("Contex is empty!\n");
    }

    public void printContex(){
        LinkedList<Node> res = new LinkedList<>();
        for (Node node : nodeList)
            res.add(node);
        printNodeList(res);
    }

    public void add(Node unit){
        nodeList.add(unit);
    }

    public void add(LinkedList<Node> ctx){
        try{
            for (Node node : ctx)
                nodeList.add(node);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public int getLength(){
        return nodeList.size();
    }

    public Node item(int i){
        return nodeList.get(i);
    }

    public LinkedList<Node> getNode(){
        LinkedList<Node> res = new LinkedList<>();
        for (Node node : nodeList){
            res.add(node);
        }
        return res;
    }

    public LinkedList<Node> getCurrentNode(){
        LinkedList<Node> res = new LinkedList<>();
        res.add(nodeList.peek());
        return res;
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

    public LinkedList<Node> getDescendents() {
        if (!nodeList.isEmpty()) {
            for (Node node : nodeList) {
                wrapGetDescendents(node);
            }
        }
        else System.out.println("Empty Contex, will repturn empty descendent list!");
        return descendents;
    }

    private void wrapGetDescendents(Node root) {
        try{
            while (root.hasChildNodes()) {
                descendents.add(root);
                NodeList temp = root.getChildNodes();
                for (int i = 0; i < temp.getLength(); i++) {

                    descendents.add(temp.item(i));
                    root = temp.item(i);
                    wrapGetDescendents(root);
                }
            }
        } catch (Exception ex){
                ex.printStackTrace();
            }
    }

}
