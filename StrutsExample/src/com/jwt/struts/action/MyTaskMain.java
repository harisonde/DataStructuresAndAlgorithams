package com.jwt.struts.action;

import java.util.concurrent.ForkJoinPool;

public class MyTaskMain {
	
	public static void main(String[] args) {
		MyTask myTask = new MyTask(200);
		MyTaskResult myTaskResult = new MyTaskResult(100);
		MyRecursiveTask myRecursiveTask = new MyRecursiveTask(128);
		MyRecursiveAction myRecursiveAction = new MyRecursiveAction(96);
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		forkJoinPool.invoke(myTask);
		//forkJoinPool.invoke(myTaskResult);
	}

}
