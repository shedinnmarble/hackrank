package edu.university.codesprint;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

/**
 * Created by Dewei on 11/23/2016.
 * Dewei's project
 */
class Calculate {
    private Scanner in;
    Display output;

    Calculate() {
        in = new Scanner(System.in);
        output = new Display();
    }

    int get_int_val() throws IOException {
        return in.nextInt();
    }

    double get_double_val() throws IOException {
        return in.nextDouble();
    }

    static DoCalculate do_calc() {
        return new DoCalculate();
    }


    static class DoCalculate {
        double get_volume(int a) throws NumberFormatException {
            if (a <= 0) {
                throw new java.lang.NumberFormatException("All the values must be positive");
            }
            return a * a * a;
        }

        double get_volume(int l, int b, int h) throws NumberFormatException {
            if (l <= 0 || b <= 0 || h <= 0) {
                throw new java.lang.NumberFormatException("All the values must be positive");
            }
            return l * b * h;
        }

        double get_volume(double r) throws NumberFormatException {
            if (r <= 0) {
                throw new java.lang.NumberFormatException("All the values must be positive");
            }
            return (2.0 / 3.0) * Math.PI * Math.pow(r, 3);
        }

        double get_volume(double r, double h) throws NumberFormatException {
            if ((r <= 0) || (h <= 0)) {
                throw new java.lang.NumberFormatException("All the values must be positive");
            }
            return Math.PI * r * r * h;
        }
    }


    class Display {
        void display(double v) {
            System.out.println(String.format("%.3f", v));
        }
    }
}

class Volumecalcalate {

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T-- > 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }

                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main
} //end of Solution

/**
 * This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 */
class DoNotTerminate {

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
} //end of Do_Not_Terminate

