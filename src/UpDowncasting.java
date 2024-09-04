class parent {
    void display(){
        System.out.println("this is parent class");
    }
}

class child extends parent{
    void display(){
        System.out.println("this is child class");
    }
}

public class UpDowncasting{
    public static void main(String[] args) {
        parent p = new parent();
        p.display();

        p =(parent) new child();  // up casting child to parent
        p.display();

        // may be we can call only over ride method by up down casting
        child c = (child)p;    // down casting
        c.display();
    }

}