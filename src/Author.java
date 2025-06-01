import java.util.Objects;

public class Author {
    private String name;
    private String surname;

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

    public String toString() {
        return "имя и фамилия автора: " + this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author other = (Author) obj;
        return this.name.equals(other.name) &&
                this.surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
