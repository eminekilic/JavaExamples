import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number--> ");
        int tempnumb=0;
        int number = input.nextInt();
         for(int i=1;i<number;i++)
         {
             if(number % i == 0)
             {
                 tempnumb+=i;
             }
         }
         if(tempnumb == number)
         {
             System.out.println(number+" is perfect number");
         }
         else
             System.out.println(number+" is not prefect number");
    }
}