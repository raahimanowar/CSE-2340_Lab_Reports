package labreport2;

import java.util.*;

public class TooLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        if (word.length() > 10) {
            int middle = word.length() - 2;
            String abbreviation = word.charAt(0) + String.valueOf(middle) + word.charAt(word.length() - 1);
            System.out.println(abbreviation);
        } else {
            System.out.println(word);
        }

        sc.close();
    }
}