import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Adi Bolboacă on 7/27/14.
 * Bottom-up with Specification By Example
 * TDD as if you meant it
 */
public class Something {
    @Test
    public void anEmptyUniverseOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String inputUniverse = expected;

        String actual = inputUniverse.equals(UniverseBuilder.getEmptyUniverse()) ? UniverseBuilder.getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String universeWithOneCell = UniverseBuilder.getUniverse() + " with one cell";
        String inputUniverse = universeWithOneCell;

        String actual = inputUniverse.equals(universeWithOneCell) ? UniverseBuilder.getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String universeWithTwoCells = UniverseBuilder.getUniverse() + " with two cells";
        String inputUniverse = universeWithTwoCells;

        String actual = inputUniverse.equals(universeWithTwoCells) ? UniverseBuilder.getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String universeWithThreeCellsNotNeighbours = UniverseBuilder.getUniverse() + " with three cells not neighbors";
        String inputUniverse = universeWithThreeCellsNotNeighbours;

        String actual = inputUniverse.equals(universeWithThreeCellsNotNeighbours) ? UniverseBuilder.getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    private String getNotEmptyUniverse() {
        return "not empty " + UniverseBuilder.getUniverse();
    }
}