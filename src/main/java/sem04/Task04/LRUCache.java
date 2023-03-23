package sem04.Task04;

import java.util.ArrayList;
import java.util.List;

public class LRUCache<T> {

    private int size;
    private ArrayList<T> elements;

    private int count;

    public LRUCache(int size){
        this.size = size;
        this.elements = new ArrayList<>();
    }

    public void addElement(T el){
        if (elements.size() == size) elements.remove(0);
        elements.add(el);
    }

    public T getElement(int index){
        return elements.get(index);
    }

    public List<T> getAllElements(){
        return elements;
    }

}
