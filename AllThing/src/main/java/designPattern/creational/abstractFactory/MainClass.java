package designPattern.creational.abstractFactory;

import designPattern.creational.abstractFactory.absFactory.IVerticalFactory;
import designPattern.creational.abstractFactory.absFactory.VerticalFactoryImpl_Campuchia;
import designPattern.creational.abstractFactory.absFactory.VerticalFactoryImpl_VietNam;
import designPattern.creational.abstractFactory.product.ICar;

public class MainClass {
    //

    public static void main(String[] args) {
        IVerticalFactory campuchia = new VerticalFactoryImpl_Campuchia();
        ICar car = campuchia.createCar();
        //
        VerticalFactoryImpl_VietNam vietNam = new VerticalFactoryImpl_VietNam();
        ICar carVN = vietNam.createCar();
        car.comparisonCar(carVN);

    }
}
