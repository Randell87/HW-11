import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название книги: " + this.name + ", " + this.author.toString() + ", год написания: " + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.name.equals(other.name) &&
               this.author.equals(other.author) &&
               this.year == other.year;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}


