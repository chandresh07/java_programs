import java.util.Scanner;

class percentage
{
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	
	float sub1,sub2,sub3,sub4,sub5;
	System.out.println("enter the marks of sub1:");
	sub1=sc.nextFloat();	
	
	System.out.println("enter the marks of sub2:");
	sub2=sc.nextFloat();	
	
	System.out.println("enter the marks of sub3:");
	sub3=sc.nextFloat();	
	
	System.out.println("enter the marks of sub4:");
	sub4=sc.nextFloat();	
	
	System.out.println("enter the marks of sub5:");
	sub5=sc.nextFloat();	
	
	
	System.out.println("percentage "+(((sub1+sub2+sub3+sub4+sub5)/500))*100);
	}
}
