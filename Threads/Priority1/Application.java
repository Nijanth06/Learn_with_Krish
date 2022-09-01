public class Application
{
	public static void main (String [] args)
	{
		Number num = new Number();
		System.out.println("main before " + Thread.currentThread().getPriority());
		Thread thread = new Thread(num);
		thread.setPriority(10);
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
