import model.ListNode;

//删除链表倒数第N个节点
public class Test19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //找到倒数第N个节点
        int step=0;
        ListNode node = new ListNode(0);
        node.next=head;
        ListNode first=node;
        ListNode scend=node;
        while (first!=null){
            first=first.next;
            if(step>n){
                scend=scend.next;
            }
            step++;
        }
        //删除该节点
        scend.next=scend.next.next;
        return  head;
    }
}
