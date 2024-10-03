public class mergeAlternately {
    public static void main(String[] args) {
        // String s1="abc";
        // String s2="pqr";
        // String s1 = "ab";
        // String s2 = "pqrs";
        String s1="abcd";
        String s2="pq";

       String s= mergeAlternately(s1, s2);
       System.out.println(s);
    }

    static String mergeAlternately(String s1, String s2) {
       StringBuilder sb=new StringBuilder();
       int i=0;
       for(i=0;i<s1.length() &&i< s2.length();i++)
       {
          sb.append(s1.charAt(i));
          sb.append(s2.charAt(i));
       }
       while(i<s1.length())
       {
        sb.append(s1.charAt(i));
        i++;
       }
       while(i<s2.length())
       {
        sb.append(s2.charAt(i));
        i++;
       }
       return sb.toString();
    }
}

//! Question link(905)-> https://leetcode.com/problems/merge-strings-alternately/description/
