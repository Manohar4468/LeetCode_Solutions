class Solution {
    public int[] findBall(int[][] grid) {
        int[] ans= new int[grid[0].length];
        int balls=grid[0].length;
        int rows=grid.length;
        int columns=balls;
        
        for(int m=0;m<balls;m++)
        {
            int i=0;
            int j=m;
            int flag=0;
            while(i<rows){
            if(grid[i][j]==1 && (j+1)<=columns-1 && grid[i][j+1]==1) 
            {
                
                i++;
                j++;
                
            }
            else if(grid[i][j]==-1 && (j-1)>=0 && grid[i][j-1]==-1)
            {
                i++;
                j--;
            }
            else if( j==0 && grid[i][j]==-1)
            {
                ans[m]=-1;
                flag=1;
                break;
            }
            else if(j== columns-1 && grid[i][j]==1)
            {
                ans[m]=-1;
                flag=1;
                break;
            }
            else if(j==(columns-1) && grid[i][j]==-1 && grid[i][j-1]==-1)
            {
                i++;
                j--;
            }
            else if(j==0 && grid[i][j]==1 && grid[i][j+1]==1)
            {
                i++;
                j++;
            }
            else
            {
              ans[m] = -1;
              flag = 1;
             break;
             }
            }
            if(flag==0)
            {
                ans[m]=j;
            }
        }
        return ans;
    }
}