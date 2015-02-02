/**
 * Created by adi on 2/2/15.
 */
public class UniverseAggregator implements UniverseCollaborator {

    private UniverseBuilder universeBuilder;

    public UniverseAggregator(UniverseBuilder universeBuilder){

        this.universeBuilder = universeBuilder;
    }

    @Override
    public Universe getUniverse() {
        return universeBuilder.getEmptyUniverse();
    }
}
