package designPattern.creational.abstractFactory.absFactory;

import designPattern.creational.abstractFactory.product.ICar;
import designPattern.creational.abstractFactory.product.IMotorBike;

public interface IVerticalFactory {
    IMotorBike createMotorBike();
    ICar createCar();
}
