public class StringPractice {
    public static void main(String[] args) {
       StringBuffer sB = new StringBuffer("Hello");

        sB.replace(2,6,"amit");
        System.out.println(sB);
        System.out.println("amit Yadav");

        StringBuilder obj = new StringBuilder("Hello");
        obj.append("World?");

        System.out.println(obj);
    }
    }

