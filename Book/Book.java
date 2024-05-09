package Book;

public abstract class Book {
    private String name;
    private String author;
    private int price;
    private int ISBN;


    public Book() {
    }

    public Book(String name, String author, int price, int ISBN) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", ISBN=" + ISBN +
                '}';
    }
}
