public class ExceptionHandling2 {

    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        System.out.println("hello m1");
        m2();
        System.out.println("Byee M1");
    }

    public static void m2(){

        System.out.println("Hello m2");
        try{
            System.out.println("this is a try block code");
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("this is a catch block code");
        }
        System.out.println("Byee M2");
    }
}
