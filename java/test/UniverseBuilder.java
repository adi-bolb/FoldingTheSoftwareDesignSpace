/**
 * Created by adi on 8/2/14.
 */
public class UniverseBuilder {
    public static String getUniverse() {
        return "universe";
    }

    public static String getEmptyUniverse() {
        return "empty " + getUniverse();
    }

    public static String getNotEmptyUniverse() {
        return "not empty " + getUniverse();
    }

    public static String cell() {
        return " cell";
    }
}
