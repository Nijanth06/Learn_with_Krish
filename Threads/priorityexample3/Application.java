public class Application
{
	public static void main (String [] args)
	{
		Number num = new Number();
		System.out.println("main before " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(15);
		Thread thread = new Thread(num);
		
		System.out.println("main " + Thread.currentThread().getPriority());
		System.out.println("child " + thread.getPriority());
		thread.start();
		int j;
		for (j=1; j<=10; j++)
		{
			System.out.println("Main class Thread");
		}	
	}
}
