package myPkg;

public class Staticdemo 
{
	static int a = 50;
	
	public static void printData()  // static method
	{
		
		System.out.println(a);
	}
	
	public void printData2() // non static method
	{
		System.out.println(a);
		System.out.println("This is non static");
	}
	
	public static void main(String[] args) 
	{
		Staticdemo d = new Staticdemo();
		d.printData2();
		Staticdemo.printData();
	}

}
