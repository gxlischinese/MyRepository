package exception;

public class MyException extends Exception{
    public MyException () {
        super();
    }
    public MyException (String mes) {
//        System.out.println(mes);
        super(mes);
    }
    public static  void get() {
        System.out.println("������get����");
    }
    public static void main(String[] args) {
        if(true) {
            try {
//                MyException.get();
                throw new MyException("XXX�쳣");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
