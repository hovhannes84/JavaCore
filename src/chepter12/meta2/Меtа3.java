package chepter12.meta2;

import java.lang.reflect.Method;

public class Меtа3 {
    @MyAnno
    public static void myMeth(){
        Меtа3 ob = new Меtа3();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str()+ " " + anno.val());
        }catch (NoSuchMethodException e){
            System.out.println("Meтoд не найден.");
        }



    }

    public static void main(String[] args) {
        myMeth();
    }
}
