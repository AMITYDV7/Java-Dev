public class StaticAndInstanceVariable {


    int a =9;// instance variable
    int b;

    public static void main(String[] args) {
        StaticAndInstanceVariable ins = new StaticAndInstanceVariable();  // creating object for instance variable

        System.out.println(ins.a);
        System.out.println(ins.b);
    }
}
