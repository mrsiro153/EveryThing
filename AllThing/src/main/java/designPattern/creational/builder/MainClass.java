package designPattern.creational.builder;

import designPattern.creational.builder.pk1.*;

public class MainClass {
    public static void main(String[] args) {
        //Person p = new Person.PersonBuilder("Hoang Bao","45").setHouse("VN").setOtherName(null).build();
        //System.out.println(p.getOtherName());
        //
        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        // Construct two products
        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.Show();

        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.Show();
    }
}
