/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node temp=head;
        if(temp==null || temp.next==null){
            return null;
        }
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=count/2;
        temp = head;
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }
        if(temp.next!=null){
        temp.next = temp.next.next;
        }
        return head;
    }
}