import java.util.*;

interface A
    {
	    public void calc(int n);
    }
interface B
    {
	public void display (int n);
	}
	
class C implements A,B
   {
	 public void calc (int n)
	   {
	     System.out.println("squre is:"+(n*n));
	   }
	 public void display(int n)
	   {
	     System.out.println("value of squre is:"+n);
	   }	
	
	
	  @SuppressWarnings("resource")
	public static void main(String[]args)
	  {
	        Scanner sc = new Scanner(System.in);
	        System.out.println(sc.nextInt());
	        C c = new C();    
	        c.display(5);  
	  }
}
