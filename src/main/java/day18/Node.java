package day18;

public class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {this.value = value;}

    public int getValue() {return value;}

    public Node getRight() {return right;}

    public Node getLeft() {return left;}

    public void setRight(Node right) {this.right = right;}

    public void setLeft(Node left) {this.left = left;}

    public static void addNote(int value, Node node) {
        Node nextNode = node;
        Node currentNode = null;
        while (nextNode != null) {
            currentNode = nextNode;
            if (value < currentNode.getValue()) {
                nextNode = currentNode.getLeft();
            } else {
                nextNode = currentNode.getRight();
            }
        }
        if (value < currentNode.getValue()) {
            currentNode.setLeft(new Node(value));
        } else {
            currentNode.setRight(new Node(value));
        }
    }

}
