package chepter9.callback;

public class Client implements Callback {
    public void callback(int p){
        System.out.println("Meтoд callback(), " + "вызываемый со значением  " + p) ;


    }
    void nonifaceMeth(){
        System.out.println("B классах, реализующих интерфейсы, " + "огут определяться и другие члены.");

    }

}
