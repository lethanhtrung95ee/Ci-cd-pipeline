public class SumTest {
    public static void main(String[] args) {
        int result = Sum.add(2, 3);
        if (result == 5) {
            System.out.println("Test passed!");
            System.exit(0); // success
        } else {
            System.out.println("Test failed!");
            System.exit(1); // fail
        }
    }
}
