import java.util.Scanner;

public  class Array
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*System.out.println("Type in num: ");
        int integer1 = Integer.parseInt(input.nextLine());

        System.out.println("Type in num: ");
        int integer2 = Integer.parseInt(input.nextLine());

        System.out.println("Multiplied num: " + multiply(integer1, integer2));*/

        /*System.out.println("Type in letter: ");
        String letter = input.nextLine();

        System.out.println("Type in num: ");
        int num = Integer.parseInt(input.nextLine());

        System.out.println("String: " + oneStr(letter, num));*/

        input.close();
    }
    public static int multiply(int a, int b)
    {
        return (a * b);
    }

    public static String oneStr(String a, int b)
    {
        return (a + b);
    }
}




/*public class Array {
    public static void main(String[] args)
    {

        int x = 404;

        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String el = "";

        for(int i = 0; i<str.length(); i++){
            el = str.charAt(i) + el;
        }
        int y = Integer.parseInt(el);
        if (x == y){
            return true;
        }else {
            return false;
        }
    }
}*/


