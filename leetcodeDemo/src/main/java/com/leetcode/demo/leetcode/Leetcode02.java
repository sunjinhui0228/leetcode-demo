package com.leetcode.demo.leetcode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunjianjian
 * @date 2021年06月${日}15:18
 */
@Controller
@RequestMapping("/Leetcode02")
public class Leetcode02 {

    //链表
    public class ListNode {
        int val;        //定义val变量值，存储节点值
        ListNode next;  //定义next指针，指向下一个节点，位置节点连接
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * 两数相加
     * @author sunjianjian
     * @date 2021/6/26 11:46
     * @param l1
     * @param l2
     * @return com.leetcode.demo.utils.ListNode
     */
    @RequestMapping("/addTwoNumbers")
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode head = null, tail = null;
        int carry = 0; //进位值
        while (l1 != null || l2 != null){
            //把两个链表的同一位赋值给n1,n2
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry; //和
            if (head == null){
                head = tail = new ListNode(sum % 10); //取余
            }else {
                tail.next = new ListNode(sum % 10);
                tail =  tail.next;
            }
            carry = sum / 10;  //进位值
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
