public class rotateString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        if(s.length()!=goal.length())
        {
            System.out.println("false");
        }
        else{
            s+=s;
            if(s.contains(s))
            {
                System.out.println("true");
            }
        }
    }
}
//! Question Link (796) -> https://leetcode.com/problems/rotate-string/
