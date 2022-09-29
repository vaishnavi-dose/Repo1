package poly;

import java.util.Scanner;

public class TWR3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		try(Scanner sc= new Scanner(System.in);
				Scanner sc1= new Scanner(System.in))
		{
			int no= sc.nextInt()* sc1.nextByte();
			System.out.println(no);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("V");
		}

	}

}
