 package annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* 
* 定义注解 Test 
* 首先使用ElementType.TYPE
* 运行级别定为 运行时，以便后面测试解析
 */
@Target(ElementType.PACKAGE)
 
@Retention(RetentionPolicy.RUNTIME)
 
public @interface TestA {
    String name();
    int id() default 0;
    Class<Long> gid();
}