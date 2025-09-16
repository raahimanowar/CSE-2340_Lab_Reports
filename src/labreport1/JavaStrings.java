public class JavaStrings  {
    public static void main(String[] args) {
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt1 string is: " + txt1.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));

        String txt4 = "Hello";
        System.out.println(txt4.charAt(0));
        System.out.println(txt4.charAt(4));
    }
}