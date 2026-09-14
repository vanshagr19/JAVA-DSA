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

    void insert(int idx ,int val){
        Node temp =head;
        if (idx > getsize() || idx<0){
            System.out.println("Invalid index");
            return ;
        }
        if (idx == 0) addathead(val);
        else if (idx ==getsize()) addattail(val);
        else{
            
            for (int i = 1; i < idx ; i++){
                temp=temp.next;
            }
            Node newnode =new Node(val);
            newnode.next = temp.next;
            temp.next = newnode;
        }

    }

    int  search(int x){
        Node temp = head;
        int idx = 0;
        if (head == null){
            return -1;
        }
        while (temp != null) {
            if (temp.val == x) {
                return idx;
            }
            temp = temp.next;
            idx ++;
        }
        return -1;
    }

    int getsize( ){
        Node temp =head;
        int size =0;
         if (head == null){
            return 0;
        }
        while(temp != null){
            size++;
            temp= temp.next;
        }
        return size;
        
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
    
    ll.deleteathead();
    ll.display();
    // ll.deleteattail();
    // System.out.println(ll.search(13));

    
    // System.out.println(ll.getsize() ) ;  
    ll.insert(2,40);
    ll.display();
    }
}
