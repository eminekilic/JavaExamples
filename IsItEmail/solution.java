import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mail address--> ");
        String mail = input.nextLine();

        if(Mail(mail))
        {
            System.out.println("Successful");
        }
        else
            System.out.println("Incorrect entry!");



    }
    public static  boolean Mail (String mail)
    {
        String control = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(control);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
}


