package designPattern.behavioral.iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class BookIterator implements Iterator {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private BookCollection bookCollection;
    private List<BookAggregate> books;
    private BookAggregate currentBook;

    public BookIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
        this.books = bookCollection.getLstBook();
        this.currentBook = books.get(0);
    }

    @Override
    public BookAggregate first() {
        return books.get(0);
    }

    @Override
    public BookAggregate next() {
        return findNext();
    }

    @Override
    public Boolean isLast() {
        return books.get(books.size()-1).getId().equals(currentBook.getId());
    }

    private BookAggregate findNext() {
        if (isLast()) {
            logger.error("can not get more book");
            return null;
        }
        for (BookAggregate book : books) {
            if (book.getId().equals(currentBook.getId())) {
                Integer x = books.indexOf(book);
                currentBook = books.get(x + 1);
                return books.get(x + 1);
            }
        }
        logger.error("can not get other book");
        return null;
    }
}
