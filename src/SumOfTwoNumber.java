import java.util.Scanner;

public class SumOfTwoNumber
{
    public static void main(String[] args) {
        int num1,num2,result;

        Scanner input=new Scanner(System.in);

        System.out.println("enter number first : ");
        num1=input.nextInt();

        System.out.println("enter number second : ");
        num2=input.nextInt();

        result=num1 + num2;
        System.out.println("the sum of two number is : " + result);
    }
}
