package designPattern.creational.abstractFactory.absFactory;

import designPattern.creational.abstractFactory.product.CarCampuchia;
import designPattern.creational.abstractFactory.product.ICar;
import designPattern.creational.abstractFactory.product.IMotorBike;
import designPattern.creational.abstractFactory.product.MotorbikeCampuchia;

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
