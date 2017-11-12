package designPattern.creational.abstractFactory.product;

public class CarCampuchia implements ICar{
    public CarCampuchia() {
        System.out.println("Car Campuchia is creating.....");
    }

    @Override
    public void comparisonCar(ICar car){
        if(car instanceof CarVietNam){
            System.out.println("car Viet Nam is faster car Campuchia");
        }else {
            System.out.println("car Campuchia is equality car Campuchia");
        }
    }
}
