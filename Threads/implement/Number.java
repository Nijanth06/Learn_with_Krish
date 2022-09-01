public class Number implements Runnable                                                                                      
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
	
}