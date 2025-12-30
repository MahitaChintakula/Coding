/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node mov=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mov.next=temp;
            mov=temp;
        }
        return head;
    }
    
}
