import java.util.Objects;
/**
 * A class representing a testing field with an `id` field.
 */
public class TestingField {
    private String id;

    public TestingField(String id) {
        this.id = id;
    }
    /**
     * Returns a hash code for this testing field.
     *
     * @return a hash code for this testing field
     */
    @Override
    public int hashCode() {
        int hash = 17;
        for (int i = 0; i < id.length(); i++) {
            hash = 31 * hash + id.charAt(i);
        }
        return hash;
    }
    /**
     * Returns a string representation of this testing field.
     *
     * @return a string representation of this testing field
     */
    @Override
    public String toString() {
        return "MyTestingClass{" + "id='" + id + '\'' + '}';
    }
    /**
     * Compares this testing field to the specified object.
     *
     * @param o the object to compare to this testing field
     * @return `true` if the objects are equal, `false` otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestingField that = (TestingField) o;
        return Objects.equals(id, that.id);
    }

}