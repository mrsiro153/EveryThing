package designPattern.structural.composite;

public interface BinaryTree {
    void add(BinaryTree b);
    void remove(BinaryTree b);
    void display(int indent);
}
