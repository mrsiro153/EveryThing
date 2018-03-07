package designPattern.behavioral.iterator;


public class BookAggregate{
    private Integer id;
    private String nameOfBook;

    public Integer getId() {
        return id;
    }

    public BookAggregate setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public BookAggregate setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
        return this;
    }
}
