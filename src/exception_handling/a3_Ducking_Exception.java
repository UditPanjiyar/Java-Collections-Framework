package exception_handling;

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("B");
    }
}

public class a3_Ducking_Exception {

//    either you can handle exception using throws in main method
//    or you can handle exception in main method using try catch block


//1. handling exception using throws in main method
//    public static void main(String[] args) throws ClassNotFoundException {
//        A obj = new A();
//        obj.show();
//
//    }

//2. handling exception in main method
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception handled: class Not Found " + e.getMessage());
//            e.printStackTrace();
        }

    }
}
