package chepter12.myAnnot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyAnnoMain {


    @MyAnno
    public static void main(String[] args) throws NoSuchMethodException {

        System.out.println("main");

        MyAnnoMain myAnnoMain = new MyAnnoMain();
        Method method [] = myAnnoMain.getClass().getDeclaredMethods();
        for (Method method1 : method) {
            System.out.println(method1);
            String s =null;

            Annotation []annotations = method1.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
                if (annotation instanceof MyAnno){
                    System.out.println("true" );
                }

            }

        }
        myMeth();

    }
    @MyAnno
    public static void  myMeth(){
        System.out.println("myMeth");

    }
}
