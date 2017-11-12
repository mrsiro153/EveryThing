package designPattern.creational.abstractFactory.absFactory;

import designPattern.creational.abstractFactory.product.CarVietNam;
import designPattern.creational.abstractFactory.product.ICar;
import designPattern.creational.abstractFactory.product.IMotorBike;
import designPattern.creational.abstractFactory.product.MotorbikeVietNam;

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
