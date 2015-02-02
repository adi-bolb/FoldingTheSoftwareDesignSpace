import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UniverseViewTests {

    @Test
    public void whenStartingAnEmptyUniverseIsShown(){
        UniverseView universeView = new UniverseView();
        UniverseCollaborator universeCollaborator = mock(UniverseCollaborator.class);

        universeView.show();

        verify(universeCollaborator).getUniverse();
    }

    private interface UniverseCollaborator {
        Universe getUniverse();
    }

    private class Universe {
    }
}