public class lengthOfLastWord {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        int idx=s.length()-1;
        while(idx>=0 &&s.charAt(idx)==' ')
        {
            idx--;
        }
        int start=idx;
        while(start>=0 && s.charAt(start)!=' ')
        {
            start--;
        }
        System.out.println(idx-start);

    }
}
// ! Question Link (58) -> https://leetcode.com/problems/length-of-last-word/description/