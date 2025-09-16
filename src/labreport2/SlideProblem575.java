package labreport2;

import java.util.*;

public class SlideProblem575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String topic = sc.next();

        topic = topic.toUpperCase();

        if (topic.equals("A") || topic.equals("B") || topic.equals("C")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}