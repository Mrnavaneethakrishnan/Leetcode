class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        // char c=0;
        // for(char cs:s.toCharArray())
        // {
        //     c^=cs;
        // }
        // for(char ct:t.toCharArray())
        // {
        //     c^=ct;
        // }
        // return c;
        int sum=0;
        for(int i=0;i<t.length();i++)
        {
            sum=sum+t.charAt(i);
        }
        for(int j=0;j<s.length();j++)
        {
            sum=sum-s.charAt(j);
        }
        return (char)sum;
    }
}