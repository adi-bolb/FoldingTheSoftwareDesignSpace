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
        String expected = "empty universe";
        String inputUniverse = expected;

        String actual = inputUniverse == "empty universe" ? "empty universe" : " not empty universe";
        assertEquals(expected, actual);
    }
}
