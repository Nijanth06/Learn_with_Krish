public class Number extends Thread                                                                                      
{
	@Override
	public void run()
	{
		int i;
		for (i=1; i<=10; i++)
		{
			System.out.println("Child class Thread");
		}
	}
	public static void main (String [] args)
	{
		Number num = new Number();
		num.start();
		int j;
		for (j=1; j<=10; j++)
		{
			System.out.println("Main class Thread");
		}
		
	}
	
	
}