package ExceptionDemo;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException  e){
            System.out.println(e);
        }
        finally {
            System.out.println("ended");
        }
    }
}
