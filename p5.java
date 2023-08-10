import java.util.Scanner;


public  class p5{
    public static void main(String[] args){
         Scanner inp1= new Scanner(System.in);
          System.out.println("Enter the  1st number:");
           int a =inp1.nextInt();

           if(a%2==0){
            System.out.println(a+"is a even no");
           }
         else{
            System.out.println(a+"is a odd no");
         }

    }
}