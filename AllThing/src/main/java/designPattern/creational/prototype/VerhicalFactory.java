package designPattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class VerhicalFactory {
    private static final Map<String, IVerhical> prototypes = new HashMap<>();

    static {
        prototypes.put("martin", new Bicycle("Martin"));
        prototypes.put("dream", new Motobike("dream"));
        prototypes.put("Audi", new Car("audi"));
    }
    //
    public IVerhical getPrototypes(String type){
        return prototypes.get(type).createClone();
    }
}
