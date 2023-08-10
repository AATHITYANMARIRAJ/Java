import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        int height;
        int weight;
        int bmi;
        Scanner inp=new Scanner(System.in);
        System.out.println("x:Enter the height in inches:\n");
        height=inp.nextInt();

        System.out.println("x:Enter the weight in pounds\n");
        weight=inp.nextInt();

       bmi=(height*703)/(weight);

       if(bmi>25){
        System.out.println("you are overweight\n");
       }

       else if(bmi<18){
             System.out.println("you are underweight\n");
       }

       else {
        System.out.println("you are correct weight\n");
       }
    } 
}
