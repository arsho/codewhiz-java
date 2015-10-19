
/**
 * @author arsho
 * @problemName Volume Calculator
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/testing-volume
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;
/*Code starts*/

class Calculate {

    Scanner sc = new Scanner(System.in);
    static int a, l, b, h;
    static double r, rr, hh;
    static String fig_name;
    static double res;

    public static double volume_cube(int n) {
        return n * n * n;
    }

    public static double volume_hemisphere(double temp_r) {
        return (2.0 / 3.0) * temp_r * temp_r * temp_r * Math.PI;
    }

    public static double volume_cylinder(double temp_rr, double temp_hh) {
        return Math.PI * temp_rr * temp_rr * temp_hh;
    }

    public static double volume_cuboid(int temp_l, int temp_b, int temp_h) {
        return temp_l * temp_b * temp_h;
    }
    Calculate output;

    public int getINTVal() {
        return sc.nextInt();
    }

    public double getDoubleVal() {
        return sc.nextDouble();
    }

    public static Calculate get_Vol() {
        return null;
    }

    public static double main(Object... args) {
        double val = 0.0;
        int len = args.length;

        if (args[0].getClass().getName() == "java.lang.Integer") {
            if (len == 1) {
                int temp = (int) args[0];
                if (temp <= 0) {
                    return val;
                }
                val = volume_cube(temp);
            } else {
                int temp1 = (int) args[0];
                int temp2 = (int) args[1];
                int temp3 = (int) args[2];
                if (temp1 <= 0 || temp2 <= 0 || temp3 <= 0) {
                    return val;
                }
                val = volume_cuboid(temp1, temp2, temp3);
            }
        } else {
            if (len == 1) {
                double temp = (double) args[0];
                if (temp <= 0) {
                    return val;
                }
                val = volume_hemisphere(temp);
            } else {
                double temp1 = (double) args[0];
                double temp2 = (double) args[1];
                if (temp1 <= 0 || temp2 <= 0) {
                    return val;
                }
                val = volume_cylinder(temp1, temp2);
            }
        }

        return val;
    }

    public static void display(double vol) throws IOException {
        if (vol == 0.0) {
            System.out.println("java.lang.NumberFormatException: All the values must be positive");
            //if (somethingWrong) then
            IOException e = new IOException();
            throw e;
        } else {
            System.out.printf("%.3f\n", vol);
        }
    }

}
/*Code ends*/

public class VolumeCalculator {

    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.getINTVal();
            while (T-- > 0) {
                double volume = 0.0d;
                int ch = cal.getINTVal();
                if (ch == 1) {

                    int a = cal.getINTVal();
                    volume = Calculate.get_Vol().main(a);

                } else if (ch == 2) {

                    int l = cal.getINTVal();
                    int b = cal.getINTVal();
                    int h = cal.getINTVal();
                    volume = Calculate.get_Vol().main(l, b, h);

                } else if (ch == 3) {

                    double r = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r);

                } else if (ch == 4) {

                    double r = cal.getDoubleVal();
                    double h = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }
}

/**
 * This class prevents the user from using System.exit(0) from terminating the
 * program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	

