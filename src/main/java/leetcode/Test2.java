package leetcode;

import leetcode.model.ListNode;

/**
 * @description: 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。  你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * @author: xk
 * @create: 2018-08-31 15:20
 **/
public class Test2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode((null==l1?0:l1.val)+(null==l2?0:l2.val)%10);
        if(l1.next==null && l2.next==null){
            if(((l1.val+l2.val)/10)>0){
                result.next=new ListNode((l1.val+l2.val)/10);
            }else{
                result=null;
            }
            return null;
        }else{
            result.next=addTwoNumbers(l1.next,l2.next);
            if(result.next!=null){
                result.next.val=((null==l1.next?0:l1.next.val)+(null==l2.next?0:l2.next.val)+(l1.val+l2.val)/10)%10;
            }

        }
        return result;
    }
}
