class Solution 
{
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        String[] str =new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        StringBuilder sb= new StringBuilder ("");
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        for(String str1:str)
        {
            sb.append(str1);
        }
        String result=sb.toString();
        return result.startsWith("0")?"0":result;

    }
}