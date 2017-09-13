package abstractFactory.absFactory;

import abstractFactory.product.CarVietNam;
import abstractFactory.product.ICar;
import abstractFactory.product.IMotorBike;
import abstractFactory.product.MotorbikeVietNam;

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
