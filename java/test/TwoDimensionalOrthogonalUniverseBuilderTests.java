import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adi on 2/2/15.
 */
public class TwoDimensionalOrthogonalUniverseBuilderTests {

    @Test
    public void emptyUniverseSomething(){
        UniverseBuilder universeBuilder = new TwoDimensionalOrthogonalUniverseBuilder();
        Universe emptyUniverse = new Universe();

        Universe actualUniverse = universeBuilder.getEmptyUniverse();

        assertEquals(emptyUniverse, actualUniverse);
    }
}