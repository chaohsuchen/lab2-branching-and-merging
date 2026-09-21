public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in! int here only has 32 bits, so we use long here.
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
