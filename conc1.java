import java.util.*;

class conc1
{
	conc1(int a,int b)
	{
	System.out.println("addition answer is ::"+(a+b));
	}
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a =sc.nextInt();
	System.out.println("enter the number");
	int b=sc.nextInt();
	conc1 d=new conc1(a,b);
	}
}
