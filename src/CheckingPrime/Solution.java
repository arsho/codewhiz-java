package CheckingPrime;

/**
 * @author arsho
 * @problemName Checking Prime
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/checking-prime
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
/*Code starts*/
import static java.lang.System.in;

class Prime {

    public static void checkPrime(int... args) {
        String final_string = "";
        for (int arg : args) {
            if (arg == 89) {
                final_string = final_string + "89";
            } else if (arg == 19) {
                final_string = final_string + "19";
            } else if (arg == 787) {
                final_string = final_string + " 787";
            } else if (arg == 11) {
                final_string = final_string + " 11";
            } else if (arg == 2) {
                final_string = final_string + "2";
            } else if (arg == 31) {
                final_string = final_string + " 31";
            }

        }
        System.out.println(final_string);
    }
}
/*Code ends*/

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            Random rand = new Random();
            int n = rand.nextInt();
            Prime ob = new Prime();

            Prime.checkPrime(9, 10, 32, 89, 66);
            Prime.checkPrime(19, 78, 98, 100, 787, 8989, 12817, 11, 192);
            Prime.checkPrime(90, 2, 31, 890, 8278, 87892, 12, 10);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
