package Unitlinkedlist;



public class DisplayLL{

    public static void Display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void Displayrec(Node head){
        Node temp =head;
        if (temp == null) return;
        System.out.print(temp.val +" ");
        Displayrec(temp.next);
    }

    public static void ReverseDisplay(Node temp){
        
        if (temp == null) return;
        ReverseDisplay(temp.next);
        System.out.print(temp.val +" ");
    }

    public static void main(String[] args) {
        
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    
    a.next = b;
    b.next =c ;
    c.next =d;

    // Display(a);
    // Displayrec(a);
    ReverseDisplay(a);
    }
    
}
