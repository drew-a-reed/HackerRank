import java.io.*;
import java.util.*;

public class JavaStringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String A=sc.next();
        System.out.println("Enter a word");
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String isIt = "";

        int abLength = A.length() + B.length();
        int lexicographically = A.compareTo(B);
        boolean lexicograph = (lexicographically > 0);
        String newString = (A.substring(0,1).toUpperCase() + A.substring(1)) + " " + (B.substring(0,1).toUpperCase() + B.substring(1));

        if (lexicograph) {
            isIt = "yes";
        } else {
            isIt = "no";
        }
        System.out.println(abLength +"\n"+ isIt +"\n" + newString );

    }

}