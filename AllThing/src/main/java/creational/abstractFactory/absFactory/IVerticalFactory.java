package creational.abstractFactory.absFactory;

import creational.abstractFactory.product.ICar;
import creational.abstractFactory.product.IMotorBike;

public interface IVerticalFactory {
    IMotorBike createMotorBike();
    ICar createCar();
}
