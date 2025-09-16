package labreport2;

import java.util.*;

public class SlideProblem584 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alice = sc.nextInt();
        int bob = sc.nextInt();
        int charlie = sc.nextInt();

        int leastTemp = Math.max(alice, charlie);
        int mostTemp = bob;

        if (leastTemp < mostTemp) {
            System.out.println("They can agree");
        } else {
            System.out.println("They can't agree");
        }

        sc.close();
    }
}