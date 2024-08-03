class Solution {
    public void solve(int n, String Str, List<String>result,int open_count, int close_count)
    {
        if(open_count==n && close_count==n)
        {
            result.add(Str);
            return;
        }
        else
        {
            if(open_count<n)
            {
                solve(n,Str+"(",result,open_count+1,close_count);
            }
            if(open_count > close_count)
            {
                solve(n,Str+")",result,open_count,close_count+1);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>result =new ArrayList<>();
        String Str="";
        solve (n,Str,result,0,0);
        return result;
    }
}