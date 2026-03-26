package mypackage;

/**
 * This is the main class of the application with entry point.
 *
 * @author Enter_Your_Name_Here
 * @version 1.0
 */
public class Main {
    /**
     * The main method serves as the entry point of the application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        newMethod();

        SomeClass someObject = new SomeClass("Example Name");
        System.out.println("Name from SomeClass: " + someObject.getName());
    }

    /**
     * Demonstrates a new method that can be called from the main method.
     */
    private static void newMethod() {
        System.out.println("New method called!");
    }
}
