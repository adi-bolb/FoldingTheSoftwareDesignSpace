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
        String expected = getEmptyUniverseCommon();
        String inputUniverse = expected;

        String actual = inputUniverse == getEmptyUniverseCommon() ? getEmptyUniverseCommon() : " not empty universe";
        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = getEmptyUniverseCommon();
        String inputUniverse = "universe with one cell";

        String actual = inputUniverse == "universe with one cell" ? getEmptyUniverseCommon() : "not empty universe";

        assertEquals(expected, actual);
    }

    private String getEmptyUniverseCommon() {
        return "empty universe";
    }

}
