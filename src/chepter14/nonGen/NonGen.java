package chepter14.nonGen;

public class NonGen {
    Object ob;

    public NonGen(Object o) {
        ob = o;
    }

    public Object getOb() {
        return ob;
    }
    void  showType(){
        System.out.println("Oбъeкт оЬ относится к типу " + ob.getClass().getName());
    }
}
