import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UniverseViewTests {

    @Test
    public void whenStartingAnEmptyUniverseIsShown(){
        UniverseCollaborator universeCollaborator = mock(UniverseCollaborator.class);
        UniverseView universeView = new UniverseView(universeCollaborator);

        universeView.show();

        verify(universeCollaborator).getUniverse();
    }


}

