package edu.hw3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BackwardIterator<M> implements Iterator<M> {
    private final List<M> list;
    private int currentPosition;

    public BackwardIterator(Collection collection) {
        this.list = new ArrayList<>(collection);
        this.currentPosition = collection.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentPosition >= 0;
    }

    @Override
    public M next() {
        return list.get(currentPosition--);
    }
}
