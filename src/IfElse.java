import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int age;
        System.out.println("Enter your age : ");
        age=sc.nextInt();

        if(age >= 18)
        {
            System.out.println("you are eligable in vote");
        }
        else
        {
            System.out.println("you are not eligable in vote");
        }
    }
}
