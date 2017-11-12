package designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Node implements BinaryTree{

    private List<BinaryTree> lst = new ArrayList<>();

    @Override
    public void add(BinaryTree b) {
        lst.add(b);
    }

    @Override
    public void remove(BinaryTree b) {
        lst.remove(b);
    }

    @Override
    public void display(int indent) {
        System.out.println("-"+indent);
        for(BinaryTree b: lst){
            b.display(indent+2);
        }
    }
}
