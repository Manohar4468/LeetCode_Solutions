class Solution {
public int distinctPrimeFactors(int[] nums) {
long product=1;
int f=2;
Set<Integer> s= new HashSet<>();
for(int i=0;i<nums.length;i++)
{
while(nums[i]!=1)
{
if(nums[i]%f ==0)
{
s.add(f);
nums[i]=nums[i]/f;
}
else
{
f++;
}
}
f=2;
}
System.out.println(s);
return s.size();
}
}