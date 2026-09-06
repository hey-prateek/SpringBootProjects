import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayBasics {
    public static void main(String[] args) {

        // array basic operations
        int[] arr = new int[] { 1, 2, 3, 4 };
        int arr_1[][] = { { 1 }, { 2 } };
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        for (int i[] : arr_1)
            System.out.print(i[0] + " ");
            System.out.println();

        // object array
        muskan m1=new muskan(20, "pink");
        muskan m2=new muskan(25, "blue");
        muskan[] arr_obj={m1, m2};
        System.out.println(arr_obj[1].age);

        // clone array
        int[] arr_2={1,2,3};
        int[] clone_arr=arr_2.clone();
        System.out.println(arr_2==clone_arr);
        arr_2[1]=4;
        System.out.println(arr_2[1]+" "+clone_arr[1]);

        // jagged array
        int[][] ja=new int[2][];
        ja[0]=new int[2];
        ja[1]=new int[3];






    }

}

class muskan{

    // constructor
    muskan(int age, String fav_color)
    {
        this.age=age;
        this.fav_color=fav_color;
    }

    //local variables
    int age;
    String fav_color;
}
