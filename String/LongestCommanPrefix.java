import java.util.Arrays;

public class LongestCommanPrefix {
    public static void main(String[] args) {
        String str[] = { "flower", "flight", "flow" };
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        for(String i:arr)
        {
            System.out.println(i);
        }
    
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int temp = 0;
        while (temp < s1.length() && temp < s1.length()) {
            if (s1.charAt(temp) == s2.charAt(temp)) {
                temp++;
            } else {
                break;
            }
        }
        return s1.substring(0, temp);
    }
}
//! Question link(14)-> https://leetcode.com/problems/longest-common-prefix/description/