package creational.builder.pk1;

public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    public void BuildPartA()
    {
        product.Add("PartX");
    }

    public void BuildPartB()
    {
        product.Add("PartY");
    }

    public Product GetResult()
    {
        return product;
    }
}
