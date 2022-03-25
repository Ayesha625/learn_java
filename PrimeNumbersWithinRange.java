import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int a, b, i,j;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		boolean prime;
		
		if (a <= 0 || a >= b  || b<=0 || b-a<=0) {
            System.out.println("Provide valid input");
        } 
		else{
		j=a;
		if(j==2)
		{
		    System.out.print("2 ");   
		}
		while(j<=b)
		{
		    if(j%2==0)
		   {
		        prime=false;
		         j++;
		        continue;
		     }
		    
		   else{
		        prime=true;
		        for(i=2;i<j;i++)
		        {
		            if(j%i==0)
		            {
		                prime=false;
		                continue;
		            }
		        }
		        
		        if(prime==true)
		        {
		            System.out.print(j +" ");
		        }
		    }
		    j++;
		}
		} 
	}
}



