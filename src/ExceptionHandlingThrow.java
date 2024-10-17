public class ExceptionHandlingThrow {

    public static void main(String[] args) {


        try {
            throw new ArithmeticException("meri marzi");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}

