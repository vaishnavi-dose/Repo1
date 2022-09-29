package poly;
interface TestInterface2
{
	void Add(int x, int y);
	
	default void show()
	{
		System.out.println("Default");
	}
}

class DefaultMethod2 implements TestInterface2
{
	public void Add(int x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod2 d= new DefaultMethod2();
		d.Add(9,3);
		
		d.show();
	}

}
