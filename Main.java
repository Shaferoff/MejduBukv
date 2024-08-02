import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        String s;
        int longt;
        s = reader.next();
        longt = s.length();
        for (int i = 0;  i < longt; i++ )
        System.out.print(s.charAt(i)+ "*");
    }
}