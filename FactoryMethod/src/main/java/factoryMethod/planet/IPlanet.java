package factoryMethod.planet;

import factoryMethod.organism.Organism;

import java.util.List;

/**
 * Created by huydoan on 13/08/2017.
 */
public interface IPlanet {
    public IPlanet createNewPlanet();
    public List<Organism> getLstOrganism();
}
