import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> list=new LinkedList<T>();
    public MyGenericStack(){}

    public void push(T e) {
        list.add(e);
    }
    public T pop(){
        return list.removeLast();
    }
    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}