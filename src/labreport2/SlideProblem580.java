package labreport2;

import java.util.*;

public class SlideProblem580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double companyA = sc.nextDouble();
        double companyB = sc.nextDouble();
        double companyC = sc.nextDouble();
        double companyD = sc.nextDouble();

        if (companyA > companyB + companyC + companyD || companyB > companyA + companyC + companyD
                || companyC > companyA + companyB + companyD || companyD > companyA + companyB + companyC) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}