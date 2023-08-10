import java.util.Scanner;

public class p7 {
     public static void main(String[] args){
        int[] arr = new int[5];
        int n=0;
        int p=0;
        int z=0;

        System.out.println("Enter 5 numbers:");
        Scanner inp = new Scanner(System.in);
        for(int i =0;i<5;i++){
            arr[i] = inp.nextInt();
        }
       
        for(int i=0; i<5;i++){
            if(arr[i] > 0){ 
                ++p;
            }
            if(arr[i] < 0){ 
                ++n;
            }
            if(arr[i] == 0){ 
                ++z;
            }
            
        }
        System.out.println("The no of positive numberes are: "+ n);
        System.out.println("The no of negtive numbers are "+ p);
        System.out.println("The no of zeroes are: "+ z);
        
    
    }
}
