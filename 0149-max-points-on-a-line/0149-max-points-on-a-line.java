class Solution {
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    
    public int maxPoints(int[][] points) {
        int res=0,n=points.length;
        if (points.length<=2) return points.length;

        for(int i=0;i<n;i++){

            HashMap<String,Integer> slopCount=new HashMap<>();
            int duplicate = 0;
            int  max= 0;
            for(int j=i+1;j<n;j++){
                int x=points[j][0]-points[i][0];
                int y=points[j][1]-points[i][1];
                if (x==0&&y==0){
        			duplicate++;
        			continue;
        		}
                int g=gcd(x,y);
                int dx=x/g;
                int dy=y/g;
                String s=dx+"/"+dy; 
                
                slopCount.put(s,slopCount.getOrDefault(s,0)+1);

                max=Math.max(max,slopCount.get(s));
            }
            res=Math.max(max+duplicate+1,res);
        }
        
        return res;

    }
}