package Book;

public class NonFictionBook extends Book{
    private String topic;//图书主题（如历史、科学、编程等）

    public NonFictionBook() {
    }

    public NonFictionBook(String name, String author, int price, int ISBN, String topic) {
        super(name, author, price, ISBN);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString()+"topic:" + topic;
    }
}
