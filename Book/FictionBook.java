package Book;

public class FictionBook extends Book {
    private String level; //受众年龄段（如幼儿、青少年、成人等。）

    public FictionBook() {
    }

    public FictionBook(String name, String author, int price, int ISBN, String level) {
        super(name, author, price, ISBN);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+"level:" + level;
    }
}
