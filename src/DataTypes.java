public class DataTypes {
    public static long sum(int[] numbers) {
        // the original code didn't pass because the test case uses a number that is larger than 32-bit int can handle
        // this causes an overflow so the result is less than the actual sum
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
