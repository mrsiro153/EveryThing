package prototype;

public class Car implements IVerhical {
    private String type;

    public Car(String type) {
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
