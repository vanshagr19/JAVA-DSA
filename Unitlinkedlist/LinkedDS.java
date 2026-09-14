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

    void deleteattail(){
        Node temp =head;
        while(temp.next != tail){
            temp=temp.next;
    }
        tail = temp;
        tail.next =null;
    }

    boolean search(int x){
        Node temp =head;
        if (temp == null){
            return false;
        }
        while (temp != null) {
            if (temp.val == x) return true;
            temp = temp.next;
        }
        return false;
    }

    void display(){
        Node temp =head;
        if (head == null){
            System.out.println("no node found for deletion");
        }
        while(temp != null){
            System.out.print(temp.val+"->");
            temp= temp.next;
        }
        System.out.println("\n");
        }
        
    
};

public class LinkedDS {
    public static void main(String[] args) {
        
    
    Linkedlist ll =new Linkedlist();
    ll.addattail(10);

    ll.addathead(12);
    ll.addathead(13);
    ll.addathead(14);
    ll.display();
    ll.deleteathead();
    // ll.deleteattail();
    System.out.println(ll.search(15));

    ll.display();
        
    }
}
