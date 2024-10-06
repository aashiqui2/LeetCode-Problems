public class singleNumber {
    public static void main(String[] args) {
        int a[]={2,2,1};
        int ans=0;
        for(int i:a)
        {
            ans^=i;
        }
        System.out.println(ans);
    }
}
//! Question Link (136)-> https://leetcode.com/problems/single-number/description/