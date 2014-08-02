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
        String expected = getEmptyUniverse();
        String inputUniverse = expected;

        String actual = inputUniverse.equals(getEmptyUniverse()) ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverse();
        String universeWithOneCell = UniverseBuilder.getUniverse() + " with one cell";
        String inputUniverse = universeWithOneCell;

        String actual = inputUniverse.equals(universeWithOneCell) ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverse();
        String universeWithTwoCells = UniverseBuilder.getUniverse() + " with two cells";
        String inputUniverse = universeWithTwoCells;

        String actual = inputUniverse.equals(universeWithTwoCells) ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverse();
        String universeWithThreeCellsNotNeighbours = UniverseBuilder.getUniverse() + " with three cells not neighbors";
        String inputUniverse = universeWithThreeCellsNotNeighbours;

        String actual = inputUniverse.equals(universeWithThreeCellsNotNeighbours) ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    private String getEmptyUniverse() {
        return "empty " + UniverseBuilder.getUniverse();
    }

    private String getNotEmptyUniverse() {
        return "not empty " + UniverseBuilder.getUniverse();
    }
}