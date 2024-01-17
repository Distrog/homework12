public class Book {
    final private String title;
    final private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" " + author.toString() + " " + yearOfPublication + "г.";
    }

    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()) {
            return false;
        }
        Book o = (Book) other;
        return author.equals(o.author) && title.equals(o.title)
                && yearOfPublication == o.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, yearOfPublication);
    }
}
