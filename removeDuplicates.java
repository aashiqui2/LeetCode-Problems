import java.util.*;
public class removeDuplicates{
    public static void main(String[] args) {
        // int a[]={1,1,2};
        int a[]={0,0,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
    }
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }

}
//! Question link (26)->https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/