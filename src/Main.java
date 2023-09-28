import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your subtotal: ");
        double subtotal = scan.nextDouble();

        System.out.print("Please enter your tip percent as an integer: ");
        int percent = scan.nextInt();

        System.out.print("Please enter the number of people splitting the bill: ");
        int people = scan.nextInt();
        System.out.println();

        double tip = subtotal*percent/100;
        double total = tip+subtotal;
        double tipAvg = tip/people;
        double totalAvg = total/people;

        System.out.println("Your total tip is $" + String.format("%.2f", tip) + ", or $" + String.format("%.2f", tipAvg) + " per person.");
        System.out.println("This comes out to a total of $" + String.format("%.2f", total) + ".");
        System.out.println("Which means that each person will be paying $" + String.format("%.2f", totalAvg) + ".");
        System.out.println();
        System.out.println("Thank you for dining at Jeff's Lobster Bar.");
    }
}