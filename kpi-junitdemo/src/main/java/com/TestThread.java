package com;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThread {

	public static void main(final String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(new Task());
		ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
		pool.shutdown();
	}

}
