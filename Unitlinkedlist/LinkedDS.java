package Unitlinkedlist;

class Linkedlist{
    Node head;
    Node tail;

    void addattail(int x){
        Node newnode = new Node(x);
        if (head == null){
            head=tail=newnode;
        }
       else{
       tail.next = newnode;
       tail =newnode;
        } 
    }

    void addathead(int x){
        Node newnode = new Node(x);
        if (head == null){
            head = tail = newnode;
        }
        newnode.next = head;
        head = newnode;
    }

    void deleteathead(){
        if (head == null){
            System.out.println("no node for deletion");
        }
        head = head.next;
        if (head == tail){
            tail= head;
        }
    }

    void display(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp= temp.next;
        }
        }
        
    
};

public class LinkedDS {
    public static void main(String[] args) {
        
    
    Linkedlist ll =new Linkedlist();
    ll.addattail(10);

    ll.addathead(12);
    ll.deleteathead();
    ll.display();
        
    }
}
