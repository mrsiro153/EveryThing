package creational.abstractFactory;

import creational.abstractFactory.absFactory.IVerticalFactory;
import creational.abstractFactory.absFactory.VerticalFactoryImpl_Campuchia;
import creational.abstractFactory.absFactory.VerticalFactoryImpl_VietNam;
import creational.abstractFactory.product.ICar;

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
