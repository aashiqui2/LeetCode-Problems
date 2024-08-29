class Solution {
    public int addDigits(int n) {
        int sum = n;
        while (n / 10 > 0) {
            int temp = n;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n = sum;
        }
        return sum;
    }
}
//! Question link (258)-> https://leetcode.com/problems/add-digits/description/
