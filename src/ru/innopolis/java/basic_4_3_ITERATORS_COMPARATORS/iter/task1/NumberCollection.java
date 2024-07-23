package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.iter.task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NumberCollection implements Iterable<Integer> {
    private final Integer n;

    public NumberCollection(final Integer n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumberIterator(n);
    }

    private static class NumberIterator implements Iterator<Integer> {
        private int current = 1;
        private int n;

        public NumberIterator(int n) {
            this.n = n;
        }

        @Override
        public boolean hasNext() {
            return current <= n;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return current++;
        }
    }
}
