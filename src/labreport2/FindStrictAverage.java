package labreport2;

import java.util.*;

public class FindStrictAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double avg = (A+B)/2;

        if (avg > C) {
            System.out.println("Average is strictly greater than C");
        } else {
            System.out.println("Average is not strictly greater than C");
        }

        sc.close();
    }
}