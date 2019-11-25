import model.ListNode;

//链表的中间节点
public class Test876 {
    //用数组存储所有node，找到数组的中间位置
    public ListNode middleNode(ListNode head) {
        ListNode[] arr=new ListNode[100];
        int t=0;
        while (head!=null){
            arr[t++]=head;
            head=head.next;
        }

        return  arr[t/2];
    }
    //快慢两次遍历，快的每次两步，慢的一步。快的到尾时，慢的正好在中间
    public ListNode middleNode1(ListNode head){
        ListNode fast=new ListNode(2);
        ListNode slow=new ListNode(1);
        fast.next=head;
        slow.next=head;
        while (fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
}
