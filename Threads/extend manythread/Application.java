public class Application
{
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
