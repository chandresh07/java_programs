abstract class shape
{

	double length,width =0;
	public abstract void area();
}
class triangle extends shape
{
	public void area(){
	length = 15.5;
	width = 20.5;
	System.out.println("area of triangle is:"+(0.5*length*width));
	}
}
class squre extends shape
{
	public void area()
	{
	length =10.5;
	width = 2.5;
	System.out.println("area of squre is:"+(length*length));
	}
}
class mainabs 
{
	public static void main(String[]args)
	{
	triangle t = new triangle();
	t.area();
	squre s = new squre();
	s.area();
	}
}
