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

        String actual = inputUniverse == getEmptyUniverse() ? getEmptyUniverse() : " not empty universe";
        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverse();
        String universeWithOneCell = getUniverse() + " with one cell";
        String inputUniverse = universeWithOneCell;

        String actual = inputUniverse == universeWithOneCell ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverse();
        String universeWithTwoCells = getUniverse() + " with two cells";
        String inputUniverse = universeWithTwoCells;

        String actual = inputUniverse == universeWithTwoCells ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverse();
        String universeWithThreeCellsNotNeighbours = getUniverse() + " with three cells not neighbors";
        String inputUniverse = universeWithThreeCellsNotNeighbours;

        String actual = inputUniverse == universeWithThreeCellsNotNeighbours ? getEmptyUniverse() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    private String getEmptyUniverse() {
        return "empty universe";
    }

    private String getUniverse() {
        return "universe";
    }

    private String getNotEmptyUniverse() {
        return "not empty universe";
    }

}
