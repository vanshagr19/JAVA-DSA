package BasicsOfStacks;

import java.util.Stack;

public class PushAtBotton {
    public static void main(String[] args) {
        Stack<Integer> st =  new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // System.out.println(st);

        // pushatbotton(st,60 );

        // System.out.println(st);

        reverse(st);
        System.out.println(st);

    }

    public  static void pushatbotton(Stack<Integer> st , int  ele){

        if(st.size() == 0 ){
            st.push(ele);
            return ;
        }

        int top = st.pop();
        pushatbotton(st, ele);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st ){

        if (st.size() <=1 ) {
            return ;
        }
        int top = st.pop();

        reverse(st);
        pushatbotton(st, top);
    }
    
}
