package poly;

import java.io.FileOutputStream;

public class TWR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fileOutputStream = new FileOutputStream("1.txt"))
		{
			String msg= "xyz";
			byte byteArray[]= msg.getBytes();
			fileOutputStream.write(byteArray);
			System.out.println("Message");
		}
		catch (Exception exception)
		{
			System.out.println(exception);
		}
		finally
		{
			System.out.println("Msg");
		}

	}

}
