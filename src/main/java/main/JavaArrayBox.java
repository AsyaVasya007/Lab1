package main;

import java.util.Arrays;

public class JavaArrayBox<E> implements Box<E> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
}