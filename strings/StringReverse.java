package strings;

public class StringReverse {
    public static void main(String[] args) {
        String st  = "Vansh";
    StringBuilder s = new StringBuilder(st) ;

    // s.reverse();

    int i  = 0, j = s.length()-1;
    while(i<=j){
        char t1 = s.charAt(i);
        char t2 = s.charAt(j);
        s.setCharAt(i, t2);
        s.setCharAt(j, t1);
        i++;
        j--;
    }
    System.out.println(s);
    }
    
}
