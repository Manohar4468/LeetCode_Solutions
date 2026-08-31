/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int noOfElements=0;
        ListNode temp=head;
        while(temp!=null)
        {
            noOfElements++;
            temp=temp.next;
        }
        int[] arr= new int[2];
        if(noOfElements <=2)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        int cnt=0;
        List<Integer> l= new ArrayList<>();
        int previous=head.val;
        int next=-1;
        temp=head;
        while(temp!=null)
        {
            cnt++;
            if( cnt >=1 && cnt <=noOfElements-1)
            {
                if(temp.val > temp.next.val && temp.val > previous)
                {
                    l.add(cnt);
                }
                 if(temp.val < temp.next.val && temp.val < previous)
                {
                    l.add(cnt);
                }
            }
            previous=temp.val;
            temp=temp.next;

        }
        if(l.size()<2)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        int maxDistance=Math.abs(l.get(0)-l.get(l.size()-1));
        int minDistance=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++)
        {
            if(Math.abs(l.get(i)-l.get(i+1))<minDistance)
            {
                minDistance=Math.abs(l.get(i)-l.get(i+1));
            }
        }


        arr[0]=minDistance;
        arr[1]=maxDistance;
        return arr;
    }
}