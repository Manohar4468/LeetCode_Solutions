class Solution {
public:
    vector<int> executeInstructions(int n, vector<int>& startPos, string s) {
        vector<int> ans;
        for(int i=0;i<s.size();i++)
        {   int temp1=startPos[0];
            int temp2=startPos[1];
            int cnt=0;
            for(int j=i;j<s.size();j++)
            {
                if(s[j]=='R')
                {
                    if((temp2+1)<n)
                    {
                        temp2++;
                        cnt++;
                    }
                    else
                    {
                        break;
                    }

                }
                else if(s[j]=='L')
                {
                    if((temp2-1)>=0)
                    {
                        temp2--;
                        cnt++;
                    }
                    else
                    {
                        break;
                    }
                    
                }
                else if(s[j]=='U')
                {
                    if((temp1-1)>=0)
                    {
                        temp1--;
                        cnt++;
                    }
                    else
                    {
                        break;
                    }
                    
                }
                else if(s[j]=='D')
                {
                    if((temp1+1)<n)
                    {
                        temp1++;
                        cnt++;
                    }
                    else
                    {
                        break;
                    }
                    
                }

            }
            ans.push_back(cnt);
        }
        return ans;
    }
};