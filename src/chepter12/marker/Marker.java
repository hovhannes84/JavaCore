package chepter12.marker;

import jdk.internal.org.objectweb.asm.commons.Method;

public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();
        try {
            java.lang.reflect.Method m = ob.getClass().getMethod("myMeth");
            if ( m.isAnnotationPresent(MyMarker.class)){
                System.out.println("Маркерная аннотация MyMarker присутствует.");
            }
        }catch (NoSuchMethodException e){
            System.out.println("Meтoд не найден");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
