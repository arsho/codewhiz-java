
/**
 * @author arsho
 * @problemName Print The Array
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/java-generics
 */

import java.io.IOException;
import java.lang.reflect.Method;

class Printer {

    public static void printArray(Object[] t) {
        int len = t.length;
        for (int i = 0; i < len; i++) {
            println(t[i]);
        }
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

}

public class PrintTheArray {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
        assert count == 1;

    }
}
