package poly;


class Multithread2 extends Thread
{
	public void run() {
		
	}
}

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		for (int i=0; i<n; i++) 
		{
			Multithread2 object
				= new Multithread2();
			object.start();
		}

	}

}
