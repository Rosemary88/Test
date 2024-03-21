package myPkg;

public class QA4 extends QA2 implements QA3I
{
	public void meth4()
	{
		System.out.println("This is QA4 method");
	}

	@Override
	public void meth3_QA3I() {
		
		System.out.println("This is QA3I method");
	}

		
	public static void main(String[] args) 
	{
		QA4 r = new QA4();
		r.meth4();
		r.meth3_QA3I();
		r.meth2();
		r.meth1_QA1I();
		 
	}
}
