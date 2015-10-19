package PrivateAccess;


/**
 * @author arsho
 * @problemName Private Access
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/access-the-private
 */
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Object o;
        /*Code starts*/
        Solution s = new Solution();
        Private p = s.new Private();
        o = p;
        System.out.println(num + " is " + p.powerof2(num));
        /*Code ends*/
        System.out.println("An instance of class: " + o.getClass().getSimpleName() + " has been created");
    }//end of main

    class Private {

        private String powerof2(int num) {
            return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
        }
    }//end of Privtate
}//end of solution

