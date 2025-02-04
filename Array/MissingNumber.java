public class MissingNumber {
    public static void main(String[] args) {
        int nums[]={0,1,3};
        int result=missingNumber(nums);
        System.out.println(result);

        
    }
    public static  int missingNumber(int[] nums) {
        int size=nums.length;
        int N=size*(size+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
        }
        return N-sum;

   }
}
//! Question link(268)--> https://leetcode.com/problems/missing-number/description/