package src.main.java;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import java.util.LinkedList;
import java.io.File;

/**
 * Created by wilsonli on 5/10/16.
 */
public class Contex{
    private LinkedList<Node> stack = new LinkedList<Node>();
    private Document rootFile;

    public void setRootFile(Document doc){
        rootFile = doc;
    }

    public LinkedList<Node> getChildNodes() {
        System.out.println("get child of current contex");
        return null;
    }
}
