package creational.abstractFactory.absFactory;

import creational.abstractFactory.product.CarVietNam;
import creational.abstractFactory.product.ICar;
import creational.abstractFactory.product.IMotorBike;
import creational.abstractFactory.product.MotorbikeVietNam;

public class VerticalFactoryImpl_VietNam implements IVerticalFactory {

    @Override
    public IMotorBike createMotorBike() {
        return new MotorbikeVietNam();
    }

    @Override
    public ICar createCar() {
        return new CarVietNam();
    }
}
