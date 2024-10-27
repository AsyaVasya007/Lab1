package main;

public interface Box<E> {
    public int size();
    public boolean add(E e);
    public boolean add(int index, E element);
    public E get(int index);
    public boolean remove(int index);
    public E set(int index, E element);
    public E[] toArray();
    public String toString();
}
