public class majorityElement {
    public static void main(String[] args) {
        int a[]={3,2,3};
        int cand=0;
        int point=0;
        for(int i:a)
        {
            if(point==0)
            {
                cand=i;
            }
            if(cand==i)
            {
                point++;
            }
            else{
                point--;
            }
        }
        System.out.println(cand);
    }
}
//? Moore's voting algorithm
//! Question Link (169)-> https://leetcode.com/problems/majority-element/description/
