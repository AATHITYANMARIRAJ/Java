  import java.util.Scanner;

  public class Largest{
  public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        Scanner inp = new Scanner(System.in);
        for(int i =0;i<5;i++){
            arr[i] = inp.nextInt();
        }
        int temp = arr[0];
        for(int i=1; i<5;i++){
            if(arr[i] > temp){ 
                temp = arr[i];
            }
        }
       
        int temp1 = arr[0];
        for(int i=1; i<5;i++){
            if(arr[i] < temp1){ 
                temp1 = arr[i];
            }
        }
        
        System.out.println("The largest number is: "+ temp);
         System.out.println("The smallest number is: "+ temp1);
    }
  }