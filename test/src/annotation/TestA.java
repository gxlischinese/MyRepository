 package annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* 
* ����ע�� Test 
* ����ʹ��ElementType.TYPE
* ���м���Ϊ ����ʱ���Ա������Խ���
 */
@Target(ElementType.PACKAGE)
 
@Retention(RetentionPolicy.RUNTIME)
 
public @interface TestA {
    String name();
    int id() default 0;
    Class<Long> gid();
}