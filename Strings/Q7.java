public class Q7 {

    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Text length: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            // Attempting to call method on null reference
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            // Catching and handling the exception
            System.out.println("Caught NullPointerException: Cannot call method on null object.");
        }
    }
    public static void main(String[] args) {
        System.out.println(" Generating NullPointerException ");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e);
        }

        System.out.println("\n=== Handling NullPointerException ===");
        handleNullPointerException();
    }
}