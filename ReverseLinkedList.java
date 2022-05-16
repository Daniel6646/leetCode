package leetCode;

public class ReverseLinkedList {
	
public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        
        while(head != null)
        {
            ListNode next_node = head.next;
            head.next = prev;
             prev = head;
            head = next_node;
        }
        
        return prev;
    }
	
}

/*
 * //what we do here is we do need to change the pointer like
 * 
 * 1->2->3->4->5 everytime we do head.next = prev we bring prev to head.next
 * 
 * the order is
 * 
 * prev head head.next null 1 2 3 4 5
 * 
 * so everytime we bring prev from null to head.next we do is reverse the
 * pointer
 * 
 * https://leetcode.com/problems/reverse-linked-list/discuss/1449712/Easy-C%2B%2BJavaPythonJavaScript-Explained%2BAnimated
 * 
 * see this tutorial above -and nick white on yt
 * 
 * 
 */