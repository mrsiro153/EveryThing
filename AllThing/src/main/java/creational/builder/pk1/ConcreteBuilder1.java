package creational.builder.pk1;

public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    public void BuildPartA()
    {
        product.Add("PartA");
    }

    public void BuildPartB()
    {
        product.Add("PartB");
    }

    public Product GetResult()
    {
        return product;
    }
}
