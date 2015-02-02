import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adi on 2/2/15.
 */
public class UniverseCollaboratorTests {
    @Test
    public void atFirstAnEmptyUniverseWillBeShown(){
        UniverseBuilder universeBuilder = mock(UniverseBuilder.class);
        UniverseCollaborator universeCollaborator = new UniverseAggregator(universeBuilder);

        universeCollaborator.getUniverse();

        verify(universeBuilder).getEmptyUniverse();
    }


}
