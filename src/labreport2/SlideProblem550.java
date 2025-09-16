package labreport2;
import java.util.*;

public class SlideProblem550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pulp = sc.nextInt();
        int pages = pulp * 1000;
        int notebooks = pages / 100;

        System.out.println("Total notebooks: " + notebooks);

        sc.close();
    }
}