import model.ListNode;

//反转一个单链表。
public class Test206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode pre=null;
        while (curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }

        return pre;
    }

    public ListNode reverseList1(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p=reverseList1(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
}
