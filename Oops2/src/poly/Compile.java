package poly;

public class Compile {

	 void show(int x, int y) 
	{
		System.out.println("Integer");
	}
	
	 void show(double p, double q) 
	{
		System.out.println(" Double");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Compile obj=new Compile();
		obj.show(4,8);
		obj.show(2.2,7.9);

	}

}
