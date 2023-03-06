package chepter14.gen;

public class Gen <T> {

    T ob;

    public Gen(T o) {

        ob = o;
    }
    T getOb(){

        return ob;
    }
    public void showТype(){
        System.out.println("Tипoм Т является" + ob.getClass().getName());
        
    }
}
