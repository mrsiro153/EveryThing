package abstractFactory.absFactory;

import abstractFactory.product.ICar;
import abstractFactory.product.IMotorBike;

public interface IVerticalFactory {
    IMotorBike createMotorBike();
    ICar createCar();
}
