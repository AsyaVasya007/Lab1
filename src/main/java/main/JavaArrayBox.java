package main;

import java.util.Arrays;

public class JavaArrayBox<E> implements Box<E> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public JavaArrayBox() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public JavaArrayBox(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Данный индекс не корректен: " + capacity);
        } else {
            this.array = new Object[capacity];
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    private Object[] grow() {
        Object[] newArray = new Object[(int) (array.length * 1.5 + 1)];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        return array;
    }

    @Override
    public boolean add(E e) {
        if (size == array.length) {
            grow();
        }
        array[size] = e;
        size++;
        return true;
    }
}