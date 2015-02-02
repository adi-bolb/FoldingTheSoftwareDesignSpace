public class Universe {

    private int size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Universe universe = (Universe) o;

        if (size != universe.size) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return size;
    }
}
