package poly;

class MultithreadingDemo implements Runnable
{
	public void run() 
	{
		
	}
}

public class Multithread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0; i<n; i++) 
		{
			Thread object
				=new Thread(new MultithreadingDemo());
			object.start();
		}

	}

}
