package coding;


 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
//       Stack<Integer> palin = new Stack<>();
//         ListNode slow=head;
//         while(slow!=null)
//         {
//             palin.push(slow.val);slow=slow.next;
//         }
        
//         while(head!=null)
//         {
//             if(palin.pop()!=head.val)
//                 return false;
//             head =head.next;
//         }
//         return true;
        
        if(head==null || head.next==null)
            return true;
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow.next = reverse(slow.next);
        slow=slow.next;
        ListNode dummy =head;
        while(slow!=null)
        {
            if(slow.val!=dummy.val)
                return false;
            
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;
    }
    
    public static ListNode reverse(ListNode head)
    {
        ListNode dummy=null;
        while(head!=null)
        {
            ListNode next =head.next;
            head.next=dummy;
            dummy=head;
            head=next;
        }
        
        return dummy;
    }
    
}
