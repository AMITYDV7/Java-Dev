class Z{
    Z(){// default constructor
        System.out.println("default constructor of parent class");
    }

}

class Y extends Z{

    Y(){  // default constructor of child class
    this(10);
    }
    Y(int a){
        System.out.println("child class constructor");
    }

}

public class Constructor{
    public static void main(String[] args) {
        Y  y= new Y();


    }
}

