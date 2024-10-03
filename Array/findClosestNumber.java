public class findClosestNumber {
    public static void main(String[] args) {
        int a[]={2,-1,1};
        // int a[]={-4,-2,1,4,8};
        int max=Integer.MAX_VALUE;
        for(int i: a)
        {
            if(Math.abs(max)>Math.abs(i)|| i==Math.abs(max))
            {
                max=i;
            }
        }
        System.out.println(max);
    }
}
//! Question Link (2239)-> https://leetcode.com/problems/find-closest-number-to-zero/
