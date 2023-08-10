import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
          Scanner inp1= new Scanner(System.in);
          System.out.println("x:Enter the radius of the circle\n");
          int a=inp1.nextInt();

         
          double area=Math.PI*a*a;
          double circumference=2*Math.PI*a;

         System.out.println("the area of circle is\n"+area);
          
          System.out.println("the circumference of circle is\n"+circumference);

    }
}
