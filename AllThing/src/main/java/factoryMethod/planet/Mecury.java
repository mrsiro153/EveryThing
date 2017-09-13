package factoryMethod.planet;

import factoryMethod.organism.Devil;
import factoryMethod.organism.Orc;
import factoryMethod.organism.Organism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huydoan on 13/08/2017.
 */
public class Mecury implements IPlanet {
    //
    private List<Organism> lst = new ArrayList<>();
    //
    public Mecury(){
        lst.add(new Orc());
        lst.add(new Devil());
        createNewPlanet();
    }
    //
    @Override
    public IPlanet createNewPlanet() {
        return this;
    }
    //

    public List<Organism> getLstOrganism() {
        return lst;
    }
}
