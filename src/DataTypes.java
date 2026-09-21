public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}

// int has 4 bytes only. long int has 8 bytes.
// So it overflows, but not overflow error. Overflows in cycles and still create a number