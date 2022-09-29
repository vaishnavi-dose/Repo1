package poly;

import java.util.Scanner;

public class ExcepAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		System.out.println("Value of x:" +x);
		y=sc.nextInt();
		System.out.println("Value of y:"+y);

		try
		{
			int no= x+y;
			System.out.println("Addition"+no);
		}
		catch(Exception e)
		{
			System.out.println("Arithmatic Expression");
		}
		finally
		{
			System.out.println("Execute");
		}
	}

}
