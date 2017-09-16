package prototype;

public class Bicycle implements IVerhical {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public IVerhical createClone() {
        return this;
    }
}
