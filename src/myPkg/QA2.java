package myPkg;

public class QA2 implements QA1I
{
	public void meth2()
	{
		System.out.println("This is QA2 method");
	}
	
	
	public static void main(String[] args) 
	{
		QA2 a = new QA2();
		a.meth1_QA1I();
		a.meth2();
	}
	@Override
	public void meth1_QA1I() {
		System.out.println("This is QA1I method");
		
	}

}
