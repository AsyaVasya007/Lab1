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

    @Override
    public boolean add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Данный индекс не корректен: " + index);
        } else if (size == array.length) {
            grow();
        }
        Object[] newArray = new Object[size - index];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[index + i];
        }
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = element;
            } else if (i > index) {
                array[i] = newArray[j];
                j++;
            }
        }
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Данный индекс не корректен: " + index);
        } else {
            return (E) array[index];
        }
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Данный индекс не корректен: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Данный индекс не корректен: " + index);
        }
        array[index] = element;
        return (E) array[index];
    }

    @Override
    public E[] toArray() {
        E[] resultArray = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = (E) array[i];
        }
        return resultArray;
    }

    @Override
    public String toString(){
        return Arrays.toString(toArray());
    }
}