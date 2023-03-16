package chepter14.nonGen1;

public class Gen<T> extends NonGen {
    T ob;

    public Gen(int num, T ob) {
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
