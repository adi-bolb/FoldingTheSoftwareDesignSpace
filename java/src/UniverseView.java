import org.omg.DynamicAny._DynAnyFactoryStub;

/**
 * Created by adi on 2/2/15.
 */
public class UniverseView {

    private UniverseCollaborator universeCollaborator;

    public UniverseView(UniverseCollaborator universeCollaborator){
        this.universeCollaborator = universeCollaborator;
    }

    public void show() {
        universeCollaborator.getUniverse();
    }
}
