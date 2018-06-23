package annotation;

public class Student {
    
  
    private String name ;
    private int age;
    @MyInit(name = "")
    public void kk1(String name) {
        System.out.println(name);
    }
    @MyInit(name="kk1")
    public void kk2(String name) {
        System.out.println(name);
    }
    @MyInit(name="kk1")
    public void kk3(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student stu = new Student();
//        System.out.println(stu.kk(name));
    }
}
