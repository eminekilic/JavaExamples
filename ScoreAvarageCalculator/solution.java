import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math,physics,chemistry,turkish,history,music;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the math grade--> ");
        math = input.nextInt();
        System.out.println("Enter the physics grade--> ");
        physics = input.nextInt();
        System.out.println("Enter the chemistry grade--> ");
        chemistry = input.nextInt();
        System.out.println("Enter the math's grade--> ");
        chemistry = input.nextInt();
        System.out.println("Enter the turkish grade--> ");
        turkish = input.nextInt();
        System.out.println("Enter the history grade--> ");
        history = input.nextInt();
        System.out.println("Enter the music grade--> ");
        music = input.nextInt();
        average = (math+physics+chemistry+turkish+history+music)/6;
        if(average  >= 60)
        {
            System.out.println("Congratulations! you passed the class");
        }
        else
            System.out.println("You did not pass the class :(");
    }
}