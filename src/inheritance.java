 class A {

String city;
}
class B extends A{
    String city;

    void print(){
       this.city = "delhi";  // this keyword is used to refer the current class variable we can use without using this keyword also
        super.city = "Agra"; // super is used to refer the parent class variable
        System.out.println("Parent class variable is " + super.city);
        System.out.println("child city variable is " +this.city);
    }
}

public  class inheritance{ // public should be use for main class(file name is same to the public class name

    public static void main(String[] args) {
        B b = new B();

        b.print();

    }
}
