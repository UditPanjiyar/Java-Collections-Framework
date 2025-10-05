package exception_handling;

public class a2_Throw_vs_Throws {
    public static void main(String[] args) {
        int age = 17;
        try {
            validate(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("rest of the code...");
    }

    // Method using 'throws' in its signature
    static void validate(int age) throws Exception {
        if (age < 18) {
            // 'throw' is used to actually throw an exception
            throw new Exception("Age is not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
