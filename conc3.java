import java.util.*;

class conc3
{
	conc3(int n1,int n2)
	{
	System.out.println("multiply is:"+(n1+n2));
	}
	conc3(int n1,int n2)
	{
	System.out.println("multiply is:"+(n1-n2));
	}
	conc3(int n1,int n2)
	{
	System.out.println("multiply is:"+(n1*n2));
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String []args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number1");
	int n1=s.nextInt();
	System.out.println("enter the number2");
	int n2=s.nextInt();
	conc3 c=new conc3(n1,n2);
	}
}
