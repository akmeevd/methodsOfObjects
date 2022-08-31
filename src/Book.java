import java.util.Objects;

public class Book {
    private String name;
    private int publishingYear;

    private Author author;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return name + " " + author.toString() + " " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishingYear, author);
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;



    }

}
