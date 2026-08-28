class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        k=k%(grid.size()*grid[0].size());
        for(int m=0;m<k;m++){
	    int temp1=grid[0][0];
        int temp2=grid[0][0];
        for(int i=0;i<grid.size();i++)
        {
            for(int j=0;j<grid[i].size();j++)
            {
                temp1=grid[i][j];
                grid[i][j]=temp2;
                temp2=temp1;
            }
        }
        grid[0][0]=temp1;
        }
        return grid;
    }
};