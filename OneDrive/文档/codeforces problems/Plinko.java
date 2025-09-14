import java.util.Random;
import java.util.Scanner;

public class Plinko {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();

        // int[] arr=new int[]{1,2,3,7,8,9,13,14,15};
        int[] arr=new int[]{7,13};
        Random rand=new Random();
        int rn=rand.nextInt(arr.length);
        System.out.println(arr[rn]);
    }
    
}
