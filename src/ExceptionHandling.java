public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("amit yadav");
        try{
            System.out.println(10/0);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");


        }
    }

