package Queue;
class Node{
    Node next;
    int val;

    Node(int data){
        val = data;
    }
}

public class MyQueue {
    Node head;
    Node tail;
    int size ;

    void add(int val){

        Node newnode = new Node(val);
        if (head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    int remove(){
        int front;
        if (head == null){
            System.out.println("Invalid Oeration");
            return -1;
        }
        else{
            front = head.val;
            head = head.next ;
            size--;
        }
        return front;
    }

    int peek(){
        if(head == null){
            System.out.println("Invalid Operation");
            return -1;
        }
        return head.val;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
