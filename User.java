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
    }


}
