import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList<T> implements Iterable<T> {
    private List<T> list;

    public MyLinkedList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}