package chepter12.myAnno;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;




@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default  9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno [] value();
}
