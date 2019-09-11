package com.forOffer;

public class DetectCycle {
    /**
     * 寻找一个链表中环的入口
     * @param node
     * @return
     */
    public ListNode detectCycle(ListNode node){
        if (node==null) return null;
        ListNode slow=node;
        ListNode fast=node;
        //相遇节点
        ListNode meet=null;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                meet=slow;
                break;
            }
        }
        //若相遇节点为null，则不存在环
        if (meet==null) return  null;
        fast=node;
        while(meet!=fast){
            meet=meet.next;
            fast=fast.next;
        }
        return meet;
    }

    /**
     * 判断一个链表中是否存在环
     * @param node
     * @return
     */
    public boolean isCycle(ListNode node){
        if (node==null) return false;
        ListNode fast=node;
        ListNode slow=node;
        boolean hasC=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                hasC=true;
                break;
            }
        }
        return  hasC;
    }
}
