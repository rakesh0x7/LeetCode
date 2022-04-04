class Solution {                                
    public ListNode swapNodes(ListNode head, int k) {
        ListNode f = head;
        ListNode s = head;
        ListNode temp = head;
        
        for(int i=1; i<k; i++) {
            temp = temp.next;
        }
        f = temp;                               
        
        while(f.next != null) {
            s = s.next;                         
            f = f.next;
        }
        
        int tempNum = temp.val;          
        temp.val = s.val;
        s.val = tempNum;
        
        return head;
    }
}