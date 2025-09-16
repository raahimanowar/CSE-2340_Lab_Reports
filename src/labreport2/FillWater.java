import java.util.*;

public class FillWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int B3 = sc.nextInt();
        int fillCount = 0;

        if (B1 == 0) fillCount++;
        if (B2 == 0) fillCount++;
        if (B3 == 0) fillCount++;

        if (fillCount >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }

        sc.close();
    }
}