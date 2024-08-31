public class Overloading {

    public int add(int a,int b){

        return a+b;
    }

    public int add(int a,int b, int c){

    return  a+b+c;

    }             //THis is called method overloading same method name in different parameter in same class
         //it is part of polymorphism

    public static void main(String[] args) {
        Overloading ol = new Overloading();

        System.out.println(ol.add(4,5));
        System.out.println(ol.add(4,5,3));

    }
}
