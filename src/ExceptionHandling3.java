public class ExceptionHandling3 {

    public static void main(String[] args) {
        System.out.println("code starts");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("this is a arithmetic exception");
        }
        catch (Exception e){
            System.out.println("this is use then we don't know what will be the exception ");
        }
        finally {
            System.out.println("we usually put the important code in is which code execution is important");
        }
    }
}
