
/**
 * @author arsho
 * @problemName Area of a Parallelogram
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/area-of-a-parallelogram
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AreaOfAParallelogram {
    /*Code starts*/

    static boolean flag;
    static int B, H;

    public static Scanner sc = new Scanner(System.in);

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            System.out.println(B * H);
        }
    }

    /*Code ends*/
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
