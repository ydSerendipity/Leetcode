package Leetcode;

import java.util.Scanner;

class ListNode{

    int val;
    ListNode next;
    ListNode(int val){this.val = val;}
}

public class LinkListSort {

    static ListNode head = null;
    public static void main(String[] args){

        System.out.println("length of the link:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 0;i < num;i++){

            int n = input.nextInt();
            addNode(n);
        }
        System.out.println(getLen(head));
        for (int k = 0;k < getLen(head);k++){
            System.out.print(head.val);
            head = head.next;
        }
    }

    public static void addNode(int x){

        ListNode temp = new ListNode(x);
        if(head == null){
            head = temp;
        }
        ListNode curNode = head;
        while (curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = temp;
    }

    public static int getLen(ListNode l){

        int len = 0;
        while(l != null){
            len++;
            l = l.next;
        }
        return len;
    }
}


