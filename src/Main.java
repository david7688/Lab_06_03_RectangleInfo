import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double area = 0;
        double perim = 0;
        double c = 0;
        String trash = "";

        System.out.print("Enter the length of the rectangle: ");

        if(in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        System.out.print("Enter the width of the rectangle: ");

        if(in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        area = length * width;

        System.out.println("The area of the rectangle is " + area + " units squared");

        perim = length + width + length + width;

        System.out.println("The perimeter of the rectangle is " + perim + " units");

        c = Math.sqrt(length * length + width + width);

        System.out.println("The diagonal length of the rectangle is " + c + " units");
    }
}