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
        String expected = getUniverseBuilder().getEmptyUniverse();
        String inputUniverse = expected;

        String actual = inputUniverse.equals(getUniverseBuilder().getEmptyUniverse()) ? getUniverseBuilder().getEmptyUniverse() : getUniverseBuilder().getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getUniverseBuilder().getEmptyUniverse();
        String universeWithOneCell = getUniverseBuilder().getUniverse() + getUniverseBuilder().with() + " one" + getUniverseBuilder().cell();
        String inputUniverse = universeWithOneCell;

        String actual = inputUniverse.equals(universeWithOneCell) ? getUniverseBuilder().getEmptyUniverse() : getUniverseBuilder().getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getUniverseBuilder().getEmptyUniverse();
        String universeWithTwoCells = getUniverseBuilder().getUniverse() + getUniverseBuilder().with() + " two" + getUniverseBuilder().cell();
        String inputUniverse = universeWithTwoCells;

        String actual = inputUniverse.equals(universeWithTwoCells) ? getUniverseBuilder().getEmptyUniverse() : getUniverseBuilder().getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getUniverseBuilder().getEmptyUniverse();
        String universeWithThreeCellsNotNeighbours = getUniverseBuilder().getUniverse() + getUniverseBuilder().with() + " three" + getUniverseBuilder().cell() + " not neighbors";
        String inputUniverse = universeWithThreeCellsNotNeighbours;

        String actual = inputUniverse.equals(universeWithThreeCellsNotNeighbours) ? getUniverseBuilder().getEmptyUniverse() : getUniverseBuilder().getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    private UniverseBuilder getUniverseBuilder() {


        return universeBuilder;
    }
}