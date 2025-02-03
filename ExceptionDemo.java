public class ExceptionDemo {
    @SuppressWarnings("null")

    public static void main(String[] args) {
        try {
            // NullPointerException demonstration
            String text = null;
            text.toString();  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        } finally {
            System.out.println("Finally block executed after NullPointerException.");
        }

        try {
            // ArrayIndexOutOfBoundsException demonstration
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException.");
        }

        System.out.println("Program continues...");
    }
}
