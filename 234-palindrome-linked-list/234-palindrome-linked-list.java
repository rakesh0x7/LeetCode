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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> a = new Stack<>();
        int n = 0;
        ListNode h = head;
        while(h!=null) {
            n++;
            h = h.next;
             }
        System.out.println(n/2);
        
        ListNode t = head;
        int cnt = 0;
        if(n%2==0){
            while(cnt != (n/2)){
                a.add(t.val);
                t = t.next;
                cnt++;
            }

            while(t!=null){
                if(a.pop()!= t.val) return false;
                t = t.next;
            }
        }
        else{
            while(cnt != (n/2)){
                a.add(t.val);
                t = t.next;
                cnt++;
            }
            t  = t.next;

            while(t!=null){
                if(a.pop()!= t.val) return false;
                t = t.next;
            }
            
        }
         System.out.println(cnt);
         System.out.println(a);
        
        
        
        
        return true;

    }
}