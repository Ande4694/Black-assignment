public interface MyList<T> {

    void add(T element);
    void add(int index,T element);
    void remove(int index);
    T get(int index);
    int size();
    void print();
    String toString();
    int indexOf(T value);
    void set(int index, T value);
    boolean isEmpty();
    boolean contains(T value);



}
