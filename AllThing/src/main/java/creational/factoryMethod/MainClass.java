package creational.factoryMethod;

import creational.factoryMethod.organism.Organism;
import creational.factoryMethod.planet.Earth;
import creational.factoryMethod.planet.IPlanet;
import creational.factoryMethod.planet.Mecury;

/**
 * Created by huydoan on 13/08/2017.
 */
public class MainClass {
    /*
    * children class MUST override constructor of sub class
    * children class can using method or override it by itself
    * */
    public static void main(String[] args) {
        IPlanet p1 = new Mecury();
        IPlanet p2 = new Earth();
        //
        for(Organism o: p1.getLstOrganism()){
            o.talk();
        }
        //
        for (Organism o:p2.getLstOrganism()){
            o.talk();
        }
        /*Class1 cl = new Class1Extedn("fs");
        System.out.println(cl.getX()+" "+cl.y);
        cl.talk();*/
    }
}
