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
    }

public static String concat(String name1, String name2, String name3)
{
    return (name1 + name2 + name3);
}
}
