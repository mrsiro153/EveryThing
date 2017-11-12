package designPattern.structural.composite;

public class MainClass {

    public static void main(String[] args) {
        Node root = new Node();
        //
        Node node1 = new Node();
        Node node2 = new Node();
        //
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        //
        root.add(node1);
        root.add(node2);
        node1.add(leaf1);
        node2.add(leaf2);
        new MainClass().display(root);
    }
    //
    public void display(BinaryTree b){
        b.display(0);
    }
}
