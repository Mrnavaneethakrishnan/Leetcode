class Solution 
{
    public int compress(char[] chars) 
    {
        int index=0;
        int i=0;
        while(i<chars.length)
        {
            char c=chars[i];
            int length=0;
        
           while(i<chars.length && chars[i]==c)
           {
               i++;
               length++;
           }   
           chars[index++]=c;
           if(length>1)
           {
               for (char digit : Integer.toString(length).toCharArray()) 
               {
                   chars[index++] = digit;
               }
           }
        }
        return index;
    }
}