package chepter14.twoGen;

public class TwoGen<T,V> {
    T ob1;
    V ob2;

    public TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
    void showTypes(){
        System.out.println("Tип Т:" + ob1.getClass().getName());
        System.out.println("Tип v:" + ob2.getClass().getName());
    }
}
