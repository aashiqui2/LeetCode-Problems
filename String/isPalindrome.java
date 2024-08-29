public class isPalindrome {
    public static void main(String[] args) {
        int n=-121;
        if(isPalindrome(n))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
         int n = s.length();
         for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                return false;
            }
         }
         return true;
                
    }
}
//! Question link (9)-> https://leetcode.com/problems/palindrome-number/description/
