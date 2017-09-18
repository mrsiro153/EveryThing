package creational.abstractFactory.absFactory;

import creational.abstractFactory.product.CarCampuchia;
import creational.abstractFactory.product.ICar;
import creational.abstractFactory.product.IMotorBike;
import creational.abstractFactory.product.MotorbikeCampuchia;

public class VerticalFactoryImpl_Campuchia implements IVerticalFactory {
    @Override
    public IMotorBike createMotorBike() {
        return new MotorbikeCampuchia();
    }

    @Override
    public ICar createCar() {
        return new CarCampuchia();
    }

}
