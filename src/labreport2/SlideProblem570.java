package labreport2;

import java.util.*;

public class SlideProblem570  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int children = sc.nextInt();
        int candies = sc.nextInt();
        int needCandies = children - candies;

        if (needCandies <= 0) {
            System.out.println("No need extra candies");
        } else {
            double needPackets = (double) needCandies / 4;

            int packetsToBuy = (int) Math.ceil(needPackets);

            System.out.println("Packets to buy: " + packetsToBuy);
        }

        sc.close();
    }
}