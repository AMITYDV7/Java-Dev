public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("amit yadav");
        try{
            System.out.println(10/0); //  can cause abnormal termination
        }
        catch(Exception e) {
            e.printStackTrace(); // if we comment this so no exception is shown there
        }
        System.out.println("Hello World");

        System.out.println("--------------------------------------------------");
        }
    }

