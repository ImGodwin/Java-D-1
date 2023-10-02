import java.util.Scanner;


public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Add the length of the rectangle");
        int rectangleLength = Integer.parseInt(input.nextLine());

        System.out.println("Add the width width of the rectangle");
        int rectangleWidth = Integer.parseInt(input.nextLine());

        System.out.println("Rectangle length and width added: " + addingRectangleSides(rectangleLength, rectangleWidth));


        System.out.println("Confirm even number");
        int confirmEvenNum = Integer.parseInt(input.nextLine());

        System.out.println(confirmEvenNumMethod(confirmEvenNum));


        System.out.println("Add num Side A");
        int triangleSideA = Integer.parseInt(input.nextLine());

        System.out.println("Add num Side B");
        int triangleSideB = Integer.parseInt(input.nextLine());

        System.out.println("Add num Side C");
        int triangleSideC = Integer.parseInt(input.nextLine());

        System.out.println("Area of triangle: " + areaOfTriangle(triangleSideA, triangleSideB, triangleSideC));




        input.close();
    }

    public static int addingRectangleSides(int s1, int s2)
    {
        return ((s1 + s2) * 2);
    }

    public static int confirmEvenNumMethod(int num1)
    {
        if (num1 % 2 == 0)
        {
            return 0;
        } else {
            return 1;
        }
    }

    public static int areaOfTriangle(double a, double b, double c)
    {
    if ((a + b) > c && (a + c) > b && (b + c) > a)
    {
        //first take half of the angle
        int allAngles = (int)(a + b + c) / 2;

        int area;
        area = (int)Math.sqrt(allAngles * (allAngles - a) * (allAngles - b) * (allAngles - c));
        return area;
    }else {
        return (int)2.5;
    }
    }
}
