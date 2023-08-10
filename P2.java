import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
          Scanner inp1=new Scanner(System.in);
          Scanner inp2=new Scanner(System.in);
          System.out.println("enter the first number:\n");
          int a=inp1.nextInt();
           System.out.println("enter the second number:\n");
          int b=inp2.nextInt();
           if(a>b){
            System.out.println(a+"is greater than"+b);
           }
           if(b>a){
            System.out.println(b+"is greater than"+ a);
           }
           if(a==b){
            System.out.println(a+"is equal to"+b);
           }
    }
}
