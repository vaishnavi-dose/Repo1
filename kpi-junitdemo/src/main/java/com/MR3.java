package com;

public class MR3 {
	
	public static void ThreadStatus() {
		System.out.println("Thread is Running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(MR3::ThreadStatus);
	}

}

