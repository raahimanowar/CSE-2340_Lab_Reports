import java.util.*;

public class SlideProblem605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int eligibleVoters = 0;

        for (int i = 1; i <=N; i++) {
            int age = sc.nextInt();

            if (age >= X) {
                eligibleVoters++;
            }
        }

        System.out.println("Eligible voters: " + eligibleVoters);

        sc.close();
    }
}