import java.util.Scanner;


public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Add the length of the rectangle");
        int rectangleLength = Integer.parseInt(input.nextLine());

        System.out.println("Add the length width");
        int rectangleWidth = Integer.parseInt(input.nextLine());

        System.out.println("Confirm even number");
        int confirmEvenNum = Integer.parseInt(input.nextLine());

        System.out.println("Add num");
        int triangleSideA = Integer.parseInt(input.nextLine());

        System.out.println("Add num");
        int triangleSideB = Integer.parseInt(input.nextLine());

        System.out.println("Add num");
        int triangleSideC = Integer.parseInt(input.nextLine());

        //System.out.println(rectangleLength, rectangleWidth, confirmEvenNum, triangleSideA, triangleSideB, triangleSideC);


    }


}
