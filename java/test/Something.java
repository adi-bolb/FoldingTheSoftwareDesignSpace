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
        String expected = getEmptyUniverseAnother();
        String inputUniverse = expected;

        String actual = inputUniverse == getEmptyUniverseAnother() ? getEmptyUniverseAnother() : " not empty universe";
        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverseAnother();
        String inputUniverse = "universe with one cell";

        String actual = inputUniverse == "universe with one cell" ? getEmptyUniverseAnother() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverseAnother();
        String inputUniverse = "universe with two cells";

        String actual = inputUniverse == "universe with two cells" ? getEmptyUniverseAnother() : getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverseAnother();
        String inputUniverse = "universe with three cells not neighbors";

        String actual = inputUniverse == "universe with three cells not neighbors" ? getEmptyUniverseAnother() : "not empty universe";

        assertEquals(expected, actual);
    }

    private String getEmptyUniverseAnother() {
        return "empty universe";
    }

    private String getNotEmptyUniverse() {
        return "not empty universe";
    }

}
