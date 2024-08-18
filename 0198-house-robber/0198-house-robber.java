class Solution 
{
    public int rob(int[] nums) 
    {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        int sum1=0;
        int sum2=0;
        for(int num: nums)
        {
            int temp=sum1;
            sum1=Math.max(sum2+num,sum1);
            sum2=temp;
        }
        return sum1;
    }
}