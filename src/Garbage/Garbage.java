package Garbage;

public class Garbage {

    public static void main(String[] args) {
        // Creating objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Assigning obj2 reference to obj1
        obj1 = obj2;

        // Setting obj2 to null
        obj2 = null;

        // Explicitly requesting garbage collection
        System.gc();

        // Printing a message after garbage collection
        System.out.println("Garbage collection completed");
    }
}

class MyClass {
    // Some class members and methods can be added here
    public MyClass(){
        hello();

    }

    static void hello(){
        System.out.println("Hello");
    }


}
