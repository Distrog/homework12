public class Author {
    final private String name;
    final private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Author o = (Author) other;
        return name.equals(o.name) && surname.equals(o.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
