package labreport2;

import java.util.*;

public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);

        System.out.println(capitalized);

        sc.close();
    }
}