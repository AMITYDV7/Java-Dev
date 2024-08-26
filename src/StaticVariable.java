public class StaticVariable {

    static  int a = 6;
    static int b;

    public static void main(String[] args) {
        System.out.println(a);// we can access the static variable with or without using class name or object reference
        System.out.println(b);// but recommanded to use with class name


        StaticVariable.a = 7;// there is only a single copy is created
        System.out.println(a);// we should use static variable where the variable value is not changed frequently



    }
}
