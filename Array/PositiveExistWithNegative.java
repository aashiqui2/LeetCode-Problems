public class PositiveExistWithNegative {
    public static void main(String[] args) {
        int a[] = { -1, 2, -3, 3 };
        System.out.println(findLargestPositiveWithNegative(a));
    }

    public static int findLargestPositiveWithNegative(int[] a) {
        int largest = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == -a[j]) {
                    largest = Math.max(largest, Math.abs(a[i]));
                }
            }
        }

        return largest;
    }
}
//! Question link (2441)-> https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/
