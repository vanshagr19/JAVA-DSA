package BasicsOfStacks;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        

        // Basic Functios Of stack


        st.push("Vansh");
        st.push("Anshika");
        st.push("Anshika");
        st.push("Anshika");
        st.push("Vanshika");
        
        System.out.println(st);

        st.pop();

        System.out.println(st.peek());

        System.out.println(st.size());
    }
}
