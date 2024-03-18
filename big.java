import java.util.Scanner;
class big{
	@SuppressWarnings("resource")
	public static void main(String[]args){
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter the first number");
	long a =sc.nextLong();
	
	System.out.println("enter the second number");
	long b =sc.nextLong();
	
	long sum = a+b;
	System.out.println("sum is:"+sum);
	
	 }
}
