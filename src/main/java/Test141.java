import model.ListNode;

//环形链表
public class Test141 {
    public boolean hasCycle(ListNode head) {
        //一个每次跳一个，一个每次跳两个
        ListNode fast=new ListNode(-1);
        ListNode slow=new ListNode(-2);
        fast.next=head;
        slow.next=head;
        while(fast!=null && slow!=null){
            if(fast!=slow){
                fast=fast.next.next;
                slow=slow.next;
            }else{
                return true;
            }

        }
        return false;
    }
}
