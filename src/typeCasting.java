public class typeCasting {


    public static void main(String[] args) {
        int a = 8;
        int b= 7;
        System.out.println("Normal variable " + a);

        double d = a;

        System.out.println(d);
        System.out.println((double)b); // this is the in line type casting mtlb same line mai type casting krna

        System.out.println("-------------------------");

        // explicit type casting
        double dou = 12.34;
        System.out.println("dou is + " +dou);

        int c = (int)dou;
        System.out.println("explicit type is " + c);
    }
}
