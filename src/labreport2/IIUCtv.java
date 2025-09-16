package labreport2;

import java.util.*;

public class IIUCtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groupSize = sc.nextInt();
        int subscriptionPrice = sc.nextInt();
        double subscriptionGroup = (double) groupSize / 6;
        int totalCost = (int) (subscriptionPrice * Math.ceil(subscriptionGroup));

        System.out.println("Total cost: " + totalCost);

        sc.close();
    }
}