import java.util.*;

public class temp{
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
		    int x=sc.nextInt();
		    if(x<10)
		    System.out.println(x);
		    else
		    {
		        int temp=10, temp1=0;
		        while(x>0)
		        {
		            temp1=x%10;
		            x=(int)(x/10);
		            if(temp1<temp)
		            {
		                temp=temp1;
		            }
		            
		        }
		        System.out.println(temp);
                // sc.nextLine();

		    }
		}
	}
}
