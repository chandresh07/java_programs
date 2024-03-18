

import java.util.*;
class first
{
	first(String nm)
	{
		System.out.println("name is::"+nm);
	}
}
class second
{
	second(String snm)
	{
		System.out.println("surname is::"+snm);
	}
}
class conc2
{		
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String  nm=sc.next();
		System.out.println("enter the surname");
		String snm=sc.next();
		first c = new first(nm);
		second d = new second(snm);
		
	}
}
