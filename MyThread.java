package Assignment;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread : "+i);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
