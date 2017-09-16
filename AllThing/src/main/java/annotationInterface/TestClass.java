package annotationInterface;


public class TestClass {
    String aa;

    @IExample(value = 33)
    public String getAa() {
        return aa;
    }

    public TestClass setAa(String aa) {
        this.aa = aa;
        return this;
    }
}

