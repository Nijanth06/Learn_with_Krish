public class Number extends Thread                                                                                      
{
	@Override
	public void start()
	{
		System.out.println("This is Start");
	}
	
	@Override
	public void run()
	{
		int i;
		for (i=1; i<=10; i++)
		{
			System.out.println("Child class Thread");
		}
	}	
}