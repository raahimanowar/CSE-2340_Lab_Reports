import java.util.*;

public class Assignment  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int submissionTime = 10;
        int totalAssignment = 3;
        int startTime = sc.nextInt();
        int completableAssignment = submissionTime - startTime;

        if (completableAssignment >= totalAssignment) {
            System.out.println("He'll be able to complete the assignment on time");
        } else {
            System.out.println("He won't be able complete the assignment on time");
        }

        sc.close();
    }
}