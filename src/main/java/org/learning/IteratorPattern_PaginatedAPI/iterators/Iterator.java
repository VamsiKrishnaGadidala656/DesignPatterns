package org.learning.IteratorPattern_PaginatedAPI.iterators;

public interface Iterator<T> {

    boolean hasNext();
    T next();
}
