package Unitlinkedlist;

public class reverseSubLL {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        for (int i = 4; i >= 0; i++) {
            ll.addathead(i + 1);
        }

        ll.display();
    }

}
