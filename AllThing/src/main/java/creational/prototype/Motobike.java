package creational.prototype;

public class Motobike implements IVerhical{
    String type;

    public Motobike(String type) {
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
