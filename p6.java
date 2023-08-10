import java.util.Scanner;

public class p6 {
    public static void main(String[] args){
         
          int[] arr = new int[11];
          int[] arr2 = new int[11];
          int s=0;
          int c=0;
          Scanner inp1= new Scanner(System.in);
          
           for(int i=2;i<11;i++){
               arr[i]=i*i;
           }
           
            for(int i=2;i<11;i++){
               arr2[i]=i*i*i;
           }

          

          for(int i=2;i<11;i++){
            s=s+arr[i];
          }

          for(int i=2;i<11;i++){
            c=c+arr2[i];
          }
          
          System.out.println("Square is: "+ s);
          System.out.println("Cube is "+ c);

    }
    
}
