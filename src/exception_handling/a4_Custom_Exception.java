package exception_handling;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class a4_Custom_Exception {
    public static void main(String[] args) {
        int age = 15; // Example age
        try {
            checkAge(age);
            System.out.println("Access granted - You are old enough.");
        }
        catch (InvalidAgeException  e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access denied - You must be at least 18 years old.");
        }
    }
}
