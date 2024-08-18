class Solution
{
    public int maxArea(int[] height) 
    {
        // int n = height.length;
        int left=0;
        int right=height.length-1;
        int container=0;
        while(left<right)
        {
            int current=Math.min(height[left],height[right])*(right-left);
            container=Math.max(container,current);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return container;
    }
}