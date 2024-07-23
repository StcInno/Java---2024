package ru.innopolis.java.basic_4_3_ITERATORS_COMPARATORS.iter.task2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenNumberIterator implements Iterator<Integer> {
    private final List<Integer> numbers;
    private int currentIndex = 0;

    public EvenNumberIterator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < numbers.size()) {
            if (numbers.get(currentIndex) % 2 == 0) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Integer next() {
       if (!hasNext()) {
           throw new NoSuchElementException();
       }
       return numbers.get(currentIndex++);
    }
}
