import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Adi Bolboacă on 7/27/14.
 * Bottom-up with Specification By Example
 * TDD as if you meant it
 */
public class Something {
    UniverseBuilder universeBuilder;

    @Before
    public void setup(){
        universeBuilder = new UniverseBuilder();
    }

    @Test
    public void anEmptyUniverseOnTickTransformsIntoAnEmptyUniverse(){


        String expected = universeBuilder.getEmptyUniverse();
        String inputUniverse = expected;


        String actual = inputUniverse.equals(universeBuilder.getEmptyUniverse()) ? universeBuilder.getEmptyUniverse() : universeBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){


        String expected = universeBuilder.getEmptyUniverse();


        String universeWithOneCell = universeBuilder.getUniverse() + universeBuilder.with() + " one" + universeBuilder.cell();
        String inputUniverse = universeWithOneCell;


        String actual = inputUniverse.equals(universeWithOneCell) ? universeBuilder.getEmptyUniverse() : universeBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){


        String expected = universeBuilder.getEmptyUniverse();


        String universeWithTwoCells = universeBuilder.getUniverse() + universeBuilder.with() + " two" + universeBuilder.cell();
        String inputUniverse = universeWithTwoCells;


        String actual = inputUniverse.equals(universeWithTwoCells) ? universeBuilder.getEmptyUniverse() : universeBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){


        String expected = universeBuilder.getEmptyUniverse();


        String universeWithThreeCellsNotNeighbours = universeBuilder.getUniverse() + universeBuilder.with() + " three" + universeBuilder.cell() + " not neighbors";
        String inputUniverse = universeWithThreeCellsNotNeighbours;


        String actual = inputUniverse.equals(universeWithThreeCellsNotNeighbours) ? universeBuilder.getEmptyUniverse() : universeBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

}