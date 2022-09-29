package poly;
interface TestInterface
{
	public void square(int x);
	
	default void show()
	{
		System.out.println("Default Method");
	}
}


class DefaultMethod implements TestInterface
{
	
	public void square(int x) {
		System.out.println(x*x);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DefaultMethod d = new DefaultMethod();
		d.square(5);
		
		d.show();

	}

}
