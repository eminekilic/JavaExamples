import java.util.Scanner;
public class Main {

    //Write a program that calculates the sum of the digits of a number.
    //Example : 1643 = 1 + 6 + 4 + 3 = 14
    public static void main(String[] args)
    {
        int number,sum=0,lastnumb;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number--> ");
        number = scanner.nextInt();
        while(number!=0)
        {
            lastnumb = number%10;
            sum += lastnumb;
            number = number/10;

        }
        System.out.println("Sum ="+sum);

    }
}