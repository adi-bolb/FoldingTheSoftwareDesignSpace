/**
 * Created by adi on 8/2/14.
 */
public class UniverseBuilder {
    public String getUniverse() {
        return "universe";
    }

    public String getEmptyUniverse() {
        return "empty " + getUniverse();
    }

    public String getNotEmptyUniverse() {
        return "not empty " + getUniverse();
    }

    public String cell() {
        return " cell";
    }

    public String with() {
        return " with";
    }
}
