package creational.builder.pk1;

import java.util.ArrayList;

public class Product {
    ArrayList parts = new ArrayList();

    public void Add(String part)
    {
        parts.add(part);
    }

    public void Show()
    {
        System.out.println("\nProduct Parts -------");
        for(Object p: parts){
            System.out.println(p);
        }
    }
}
