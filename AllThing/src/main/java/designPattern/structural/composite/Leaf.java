package designPattern.structural.composite;

public class Leaf implements BinaryTree {
    @Override
    public void add(BinaryTree b) {
        System.out.println("You're leaf, can not add more");
    }

    @Override
    public void remove(BinaryTree b) {
        System.out.println("Your're leaf, can not remove more");
    }

    @Override
    public void display(int indent) {
        System.out.println(indent);
    }
}
