package strings;

public class StringReverse {
    public static void main(String[] args) {
        String st = "Vansh";
        StringBuilder s = new StringBuilder(st);

        // s.reverse();

        int i = 0, j = s.length() - 1;
        // while(i<=j){
        // char t1 = s.charAt(i);
        // char t2 = s.charAt(j);
        // s.setCharAt(i, t2);
        // s.setCharAt(j, t1);
        // i++;
        // j--;
        // }

        s.deleteCharAt(3);
        s.insert(3, 's');
        s.delete(1, 5); // delete 3 to 4
        System.out.println(s);
    }

}
