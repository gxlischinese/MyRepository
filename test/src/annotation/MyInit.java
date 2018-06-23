package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//@Target(ElementType.FIELD)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyInit {
    public String name();
//    public int age();
}
