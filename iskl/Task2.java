public class Task2 {
    public static void main(String[] args) {
        correctCode2();
    }

    private static void correctCode2() {
        try {
            int[] intArray = { 2, 3, 4, 5, 6, 7 };
            int d = 0;
            double catchedRes1 = intArray[5] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}