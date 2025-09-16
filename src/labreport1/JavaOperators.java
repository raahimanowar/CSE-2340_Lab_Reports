public class JavaOperators  {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        // These are arithmetic operation
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        // These are logical operation
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}