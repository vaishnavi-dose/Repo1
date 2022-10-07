package com;

import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Long duration = (long)(Math.random()*5);
			System.out.println("Running Task!");
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Task Completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
