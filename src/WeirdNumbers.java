
/**
 * @author arsho
 * @problemName Weird Numbers
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/weird-numbers/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeirdNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n % 2 == 1) {
            println("Weird");
        } else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            println("Not Weird");
        } else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            println("Weird");
        } else if (n % 2 == 0 && (n > 20)) {
            println("Not Weird");
        }

    }

    public static void println(Object obj) {
        System.out.println(obj);
    }
}
