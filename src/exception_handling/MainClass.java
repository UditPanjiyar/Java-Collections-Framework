package exception_handling;

public class MainClass {
    public static void main(String[] args) {


//        int arr[] = new int[5];
//        System.out.println("Hello guys 1");
//
//        try{
//            int res  = 5/0;
//            System.out.println(arr[7]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("array index out of bounnd: "+ e.getMessage());
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Hello guys 1");


// *************** handling all with different catch block *************

        int arr[] = new int[5];
        System.out.println("Hello guys 1");

        try{
            int res  = 5/0;
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException  | ArithmeticException | NullPointerException e){
            System.out.println("Handling exception: "+ e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("handling exception at all: " + e.getMessage());
        }

        finally {
            System.out.println("i will run always");
        }

        System.out.println("Hello guys 2");


    }

}
