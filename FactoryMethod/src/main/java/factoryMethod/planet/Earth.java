package factoryMethod.planet;

import factoryMethod.organism.Devil;
import factoryMethod.organism.Human;
import factoryMethod.organism.Organism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huydoan on 13/08/2017.
 */
public class Earth implements IPlanet {
    //
    private List<Organism> lst = new ArrayList<>();
    //
    public Earth(){
        lst.add(new Human());
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
