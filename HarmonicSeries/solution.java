import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int n;
        double hnumber=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a n number--> ");
        n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            hnumber += (1.0/i);// we use 1.0 because our hnumber value is double
        }
        System.out.println("Number's harmonic series is--> "+hnumber);
    }
}