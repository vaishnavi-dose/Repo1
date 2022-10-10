package practice;

public class Animal implements Lion, Tiger {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "roar";
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "yellow";
	}

	@Override
	public int No_of_Legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	
}
