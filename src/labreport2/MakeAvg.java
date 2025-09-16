import java.util.*;

public class MakeAvg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        A = sc.nextInt();
        C = sc.nextInt();

        if ((A + C) % 2 == 0) {
            B = (A + C) / 2;

            System.out.println("B exists. B is: " + B);
        } else  {
            System.out.println("B doesn't exists");
        }

        sc.close();
    }
}