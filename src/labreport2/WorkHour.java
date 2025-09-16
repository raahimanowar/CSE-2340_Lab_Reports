import java.util.*;

public class WorkHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int totalWorkHours = (X * 4) + Y;

        System.out.println("Total work hours: " + totalWorkHours);

        sc.close();
    }
}