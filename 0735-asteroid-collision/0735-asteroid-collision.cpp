class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> st;
       // st.push(asteroids[0]);
for(int i = 0; i < asteroids.size(); i++)
{
    int current = asteroids[i];
    bool destroyed = false;

    while(!st.empty() && st.top() > 0 && current < 0)
    {
        if(abs(st.top()) > abs(current))
        {
            destroyed = true;
            break;
        }
        else if(abs(st.top()) < abs(current))
        {
            st.pop();
        }
        else
        {
            st.pop();
            destroyed = true;
            break;
        }
    }

    if(!destroyed)
    {
        st.push(current);
    }
}
        vector<int> res;
        while(!st.empty())
        {
            res.push_back(st.top());
            st.pop();
        }
        for(int i=0;i<res.size()/2;i++)
        {
            int temp=res[i];
            res[i]=res[res.size()-i-1];
            res[res.size()-i-1] = temp;
        }
        return res;
    }
};