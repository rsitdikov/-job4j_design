package ru.job4j.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CyclicIterator<T> implements Iterator<T> {

    private List<T> data;
    int index = 0;

    public CyclicIterator(List<T> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return data != null && data.size() > 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw  new NoSuchElementException();
        }
        if (index == data.size()) {
            index = 0;
        }
        return data.get(index++);
    }
}