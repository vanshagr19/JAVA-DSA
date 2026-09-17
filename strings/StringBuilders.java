package strings;

public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(12);
        // System.out.println(s.length() +" " + s.capacity());

        s.append("Vansh Agrawal ");
        
        //  System.out.println(s.length() +" " + s.capacity());
        

        s.setCharAt(1, 'o');
        System.out.println(s);
    }   


    
}
