public class Number extends Thread
{
	@Override
	public void run()
	{
		int i;
		for (i=1; i<=10; i++)
		{
			System.out.println("single Thread");
		}
	}
	public static void main (String [] args)
	{
		Number num = new Number();
		num.start();
	}
	
	
}