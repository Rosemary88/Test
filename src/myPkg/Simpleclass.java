 package myPkg;

public class Simpleclass 
{
	int a = 100;
	
	public void printdata()
	{
		final int a =200;//final keyword
		//a=300;
		System.out.println(a);
		System.out.println(this.a); //this keyword
	}
	public void myfunc(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum: " + c);
	}
	public static void main(String[] args) 
	{
		
		Simpleclass n = new Simpleclass();
		
		n.printdata();
	}

}
