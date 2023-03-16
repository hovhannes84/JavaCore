package chepter14.gan3;

public class Gen2<T> extends Gen<T> {
    public Gen2(T ob) {
        super(ob);
    }
    public T getOb(){
        System.out.print("Meтoд getob() из класса Gen2: ");
        return ob;
    }


}
