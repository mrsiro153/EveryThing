package designPattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection extends ObjectAggregate {
    private List<BookAggregate> books ;

    public BookCollection() {
        createDefaultBooks();
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(this);
    }

    public List<BookAggregate> getLstBook(){
        return books;
    }

    private void createDefaultBooks(){
        books = new ArrayList<>();
        books.add(new BookAggregate().setId(0).setNameOfBook("harry potter"));
        books.add(new BookAggregate().setId(1).setNameOfBook("life of PI"));
        books.add(new BookAggregate().setId(2).setNameOfBook("Kinh van hoa"));
        books.add(new BookAggregate().setId(3).setNameOfBook("chronology of narnia"));
        books.add(new BookAggregate().setId(4).setNameOfBook("vampire"));
        books.add(new BookAggregate().setId(5).setNameOfBook("hunger game"));
    }
}
