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

        String actual = inputUniverse.equals(UniverseBuilder.getEmptyUniverse()) ? UniverseBuilder.getEmptyUniverse() : UniverseBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithACellOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String universeWithOneCell = UniverseBuilder.getUniverse() + UniverseBuilder.with() + " one" + UniverseBuilder.cell();
        String inputUniverse = universeWithOneCell;

        String actual = inputUniverse.equals(universeWithOneCell) ? UniverseBuilder.getEmptyUniverse() : UniverseBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithTwoCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String universeWithTwoCells = UniverseBuilder.getUniverse() + UniverseBuilder.with() + " two" + UniverseBuilder.cell();
        String inputUniverse = universeWithTwoCells;

        String actual = inputUniverse.equals(universeWithTwoCells) ? UniverseBuilder.getEmptyUniverse() : UniverseBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

    @Test
    public void anUniverseWithThreeNotNeighbouringCellsOnTickTransformsIntoAnEmptyUniverse(){
        String expected = UniverseBuilder.getEmptyUniverse();
        String universeWithThreeCellsNotNeighbours = UniverseBuilder.getUniverse() + UniverseBuilder.with() + " three" + UniverseBuilder.cell() + " not neighbors";
        String inputUniverse = universeWithThreeCellsNotNeighbours;

        String actual = inputUniverse.equals(universeWithThreeCellsNotNeighbours) ? UniverseBuilder.getEmptyUniverse() : UniverseBuilder.getNotEmptyUniverse();

        assertEquals(expected, actual);
    }

}