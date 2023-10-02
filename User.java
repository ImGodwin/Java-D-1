import java.util.Scanner;

public class User {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Name your favorite city in Italy?");
        String name = input.nextLine();

        System.out.println("Where is this city located?");
        String location = input.nextLine();

        System.out.println("What do you love about this city?");
        String interest = input.nextLine();

        System.out.println(concat(name, location, interest));

        input.close();
    }

public static String concat(String name1, String name2, String name3)
{
    return (name1 + name2 + name3);
}
    public static void reversedstring(String n1, String n2)
    {
        String[] input = {n1 + n2};

       // for (int i = input.length - 1; i>=0; i--) {
        // String detail = input[i];
         //return detail
        //}
    }
};


