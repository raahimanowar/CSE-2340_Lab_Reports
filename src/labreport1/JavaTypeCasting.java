public class JavaTypeCasting  {
    public static void main(String[] args) {
        int maxScore = 500;

        int userScore = 423;

        double percentage = (double) userScore / maxScore * 100;

        System.out.println("User's percentage is " + percentage);
    }
}