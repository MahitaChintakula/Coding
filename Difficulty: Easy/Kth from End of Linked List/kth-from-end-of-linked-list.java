/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int target=count-k;
        if(target<0) return -1;
        temp=head;
        for(int i=0;i<target;i++){
                temp=temp.next;
        }
        return temp.data;
    }
}