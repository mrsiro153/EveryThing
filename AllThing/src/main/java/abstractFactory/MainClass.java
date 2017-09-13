package abstractFactory;

import abstractFactory.absFactory.VerticalFactoryImpl_Campuchia;
import abstractFactory.absFactory.VerticalFactoryImpl_VietNam;
import abstractFactory.product.ICar;

public class MainClass {
    //

    public static void main(String[] args) {
        VerticalFactoryImpl_Campuchia campuchia = new VerticalFactoryImpl_Campuchia();
        ICar car = campuchia.createCar();
        //
        VerticalFactoryImpl_VietNam vietNam = new VerticalFactoryImpl_VietNam();
        ICar carVN = vietNam.createCar();
        car.comparisonCar(carVN);

    }
}
