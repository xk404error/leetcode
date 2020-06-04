import model.ListNode;

//合并两个有序链表
public class Test21 {
    //空间复杂度m+n，时间复杂度m+n
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }

    }


    //空间复杂度1，时间复杂度m+n
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        ListNode pre=new ListNode(-1);
        ListNode res=pre;
        while (l1!=null && l2!=null){
            if(l1.val<l2.val){
                pre.next=l1;
                l1=l1.next;
            }else{
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        pre.next=l1==null?l2:l1;
        return res.next;
    }
}
