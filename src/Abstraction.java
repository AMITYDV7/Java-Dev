//abstract  class car{
//
//    int a;
//    public abstract void tyres();
//    car(){} // it is not necessary to add this constructor because every class has its own constructor which have zero arguments in it
//     // this program can run without using this constructor
//}
//
//
//
//public class Abstraction extends car{// ye non abstract class hai jo inherit kr rhi hai ek abstract class ko
//
//    public void tyres() {
//        System.out.println("abstraction");// we have to override the abstract method of parent class or declare this class as abstract class
//    }
//        public static void main(String[] args){
//            car c = new Abstraction();
//
//            c.tyres();
//            System.out.println(c.a);
//        }
//
//    }

class Abstraction{
    public static void main(String[] args) {
        long m =10;

        System.out.println(m);

     //  int n = m;
        int n =(int)m;

        System.out.println(n);

    }
}
