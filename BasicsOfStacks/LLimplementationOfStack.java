package BasicsOfStacks;

class Node{
    int val;
    Node next;

    Node(int data ){
        val = data;
    }
}

class MyStack{

   Node head;
   int length;

   int  peek() throws Exception{
    if (head == null){
        throw new Exception("Stack Underflow");
    }
    else{
        return head.val;
    }
   }

   int pop() throws Exception{
    if (head == null){
        throw new Exception("Stack Underflow");
    }
    else{
        int top = head.val;
        head = head.next;
        return top;
    }
   }

   void push(int ele){
   Node newnode = new Node(ele); 
    if (head == null) head = newnode;
    else{
        newnode.next = head ;
        head = newnode;
    }
   }

   void display(){
    Node temp = head;
    if (head == null){
        System.out.println("stack is empty");
    }
    while(temp != null){
        System.out.println(temp.val);
        temp = temp.next;
    }
   }
}

public class LLimplementationOfStack {
    public static void main(String[] args) throws Exception {
       MyStack st = new MyStack();

    //    st.pop();

    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(70);
    

    st.pop();
    System.out.println(st.peek());

    // st.display();
    }

}
