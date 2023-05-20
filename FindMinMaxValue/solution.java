import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you will enter--> ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        int max=0,min=1000;
        for(int i=1; i<=n; i++)
        {
            System.out.println("Enter " + i +". number--> ");
            numbers[i-1]  = input.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if(max<numbers[i])
            {
                max = numbers[i];
            }
            if(min>numbers[i])
            {
                min = numbers[i];
            }
        }
        System.out.println("Max="+max+"\nMin="+min);

    }
}