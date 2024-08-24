class Solution 
{
    public int countWays(List<Integer> nums) 
    {
        Collections.sort(nums);
        int n=nums.size(), i=0, j=0, res=0, s;
        for(i=-1;i<n;i++)
        {
            if(i+1==0 || nums.get(i)<i+1)
            {
                if(i+1==n || (i+1<n && nums.get(i+1)>i+1))
                res++;
            }
                
        }
        return res;
    }
}