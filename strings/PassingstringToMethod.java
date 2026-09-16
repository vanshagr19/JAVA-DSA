package strings;

public class PassingstringToMethod {

    
    public static void change(String s ){
        s ="Vansh";

    }

    public static void main(String[] args) {
        String s = "Agrawal";
        System.out.println(s);

        change(s);
        System.out.println(s);
    }
}
