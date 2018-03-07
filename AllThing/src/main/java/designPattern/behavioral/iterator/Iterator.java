package designPattern.behavioral.iterator;

public interface Iterator {
    BookAggregate first();
    BookAggregate next();
    Boolean isLast();
}
