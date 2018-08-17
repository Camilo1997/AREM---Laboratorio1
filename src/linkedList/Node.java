/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author camilolopez
 */
public class Node {

    private Node nextNode, priorNode;
    private boolean isRoot;
    private int infoNode;

    public Node(int infoNode) {
        this.infoNode = infoNode;
    }

    public int getInfoNode() {
        return infoNode;
    }

    public void setInfoNode(int infoNode) {
        this.infoNode = infoNode;
    }

    public boolean isIsRoot() {
        return isRoot;
    }

    public void setIsRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(Node priorNode) {
        this.priorNode = priorNode;
    }

}
