class conc
{ 
	conc()
	{
	System.out.println("this is default constructor");
	}
	conc(int a,int b)
	{
	System.out.println("addition of ::"+(a+b));
	}
	public static void main(String []args){
	conc d=new conc();
	conc d1=new conc(10,15);
	}
	}
