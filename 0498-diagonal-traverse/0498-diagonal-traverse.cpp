class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> ans;
        int start1=0;
        int start2=0;     
        int cycle=1;
        int rev=-1;
        while(start2<mat[0].size())
        {
            int temp1 = start1;
            int temp2 = start2;
            int temp3=rev+1;
            while(temp1<mat.size() && temp2>=0)
            {
                ans.push_back(mat[temp1][temp2]);
                rev++;
                temp1++;
                temp2--;
            }
            if(cycle%2==1)
            {
                int left = temp3;
                int right = rev;

                while(left < right)
                {
                    swap(ans[left], ans[right]);
                    left++;
                    right--;
                }
            }
            cycle++;
            start2++;
        }
        start1++;
        while(start1<mat.size())
        {
            int temp1 = start1;
            int temp2 = mat[0].size() - 1;
            int temp3=rev+1;
            while(temp1<mat.size() && temp2>=0)
            {
                ans.push_back(mat[temp1][temp2]);
                rev++;
                temp1++;
                temp2--;
            }     
            if(cycle%2==1)
            {
                int left = temp3;
                int right = rev;

                while(left < right)
                {
                    swap(ans[left], ans[right]);
                    left++;
                    right--;
                }
            }
            cycle++;             
            start1++;      
        }
        return ans;
    }
};