import java.util.Scanner;

public class P1{
    public static void main(String[] args){
        System.out.println("Welcome to Java");       Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter the  1st number:");
        int a =inp1.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = inp1.nextInt();
        int sum;
        int difference;
        int pro;
        int div;

        sum = a+b;
        difference = a-b;
        pro= a*b;
        div=a/b;

        System.out.println("The sum is:"+sum);
        System.out.println("The sum is:"+difference);
        System.out.println("The sum is:"+pro);
        System.out.println("The sum is:"+div);
        
    }
}