package com;

interface MathOperation{
	int operation(int a, int b);
}

public class LambdaPractice {
	
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	public int subtraction(int a, int b) {return a-b;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaPractice tester= new LambdaPractice();
		
		MathOperation addition= (int a, int b)-> a+b;
		
		MathOperation subtraction= (int a, int b)-> a-b;
		
		MathOperation multiplication= (int a, int b)-> {return a*b;};
		
		MathOperation division= (int a, int b)-> a/b;

		System.out.println("10 + 5 =" + tester.operate(10,5, addition));
		System.out.println("10 - 5 =" + tester.operate(10,5, subtraction));
		System.out.println("10 x 5 =" + tester.operate(10,5, multiplication));
		System.out.println("10 / 5 =" + tester.operate(10,5, division));
	}

}
