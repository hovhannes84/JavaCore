package chepter9.callback;

public class AnotherClient implements Callback{
    public void callback ( int р){
        System.out.println("Еще один вариант метода callback() " );
        System.out.println("p в квадрате равно " + (р*р));

    }

}
