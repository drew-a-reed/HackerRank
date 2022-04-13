import java.io.*;
import java.util.*;

public class IsItAPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String first;
        if (A.length() % 2 == 0){
             first = A.substring(0, (A.length()/2));
        } else {
             first = A.substring(0, (A.length() / 2 + 1));
        }
        String second = A.substring((A.length()/2));
        StringBuilder sb = new StringBuilder(second);
        sb.reverse();
        boolean isIt = first.contentEquals(sb);
        if (isIt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}




