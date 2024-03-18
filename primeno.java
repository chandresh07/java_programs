


import java.util.Scanner;

class primeno
{
	@SuppressWarnings("resource")
	public static void main(String[]args)
	{
		Scanner ab= new Scanner(System.in);
		System.out.println("enter the number");
		int n= ab.nextInt();
		
			if(n%2==0){
			System.out.println("the numbe is prime");
			}
			else{
			System.out.println("the number is not prime");
			}
	}			
}

