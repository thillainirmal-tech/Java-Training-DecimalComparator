public class DecimalComparator {
 
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));       // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));      // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));       // Output: false
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.175));     // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.176));     // Output: false
    }
}
