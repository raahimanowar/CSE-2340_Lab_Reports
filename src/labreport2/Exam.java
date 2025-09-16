import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int totalStudent = X * Y;

        double passingPercentage = ((double) Z * 100) / totalStudent;

        if (passingPercentage > 50) {
            System.out.println("Passing percentage is strictly greater than 50%");
        } else {
            System.out.println("Passing percentage is not strictly greater than 50%");
        }

        sc.close();
    }
}