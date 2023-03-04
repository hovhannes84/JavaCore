package chepter12.meta2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str ()default "Тестирование";
    int val() default 9000;



}
