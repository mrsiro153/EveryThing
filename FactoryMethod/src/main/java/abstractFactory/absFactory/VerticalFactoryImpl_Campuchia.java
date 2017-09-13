package abstractFactory.absFactory;

import abstractFactory.product.CarCampuchia;
import abstractFactory.product.ICar;
import abstractFactory.product.IMotorBike;
import abstractFactory.product.MotorbikeCampuchia;

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
