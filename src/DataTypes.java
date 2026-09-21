public class DataTypes {
    public static long sum(int[] numbers) {
        //the original code did not pass because the test case uses a number that is larger than 32bits integer
        //so it causes an overflow and fails
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
