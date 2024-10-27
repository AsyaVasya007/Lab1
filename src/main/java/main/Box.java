package main;

public interface Box<E> {
    public int size();
    public boolean add(E e);
}
