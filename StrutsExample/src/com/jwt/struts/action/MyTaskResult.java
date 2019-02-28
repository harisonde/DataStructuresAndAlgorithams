package com.jwt.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class MyTaskResult extends RecursiveTask<Integer> {
	int numTasks;

	public MyTaskResult(int tasks) {
		this.numTasks = tasks;
	}

	protected Integer compute() {
		Integer result = 0;
		if (this.numTasks > 25) {

			List<RecursiveTask<Integer>> taskList = new ArrayList<>();
			int count = this.numTasks / 25;

			while(count > 0) {
				taskList.add(new MyTaskResult(25)); 
				count--;
			}
			for(RecursiveTask<Integer> task: taskList) { 
				System.out.println("Forking subtasks -> " + task);
				task.fork();
			}
			
			for(RecursiveTask<Integer> task: taskList) { 
				System.out.println("Forking subtasks -> " + task);
				result +=  task.join();
			}
			
			System.out.println("Returned result is " + result);

		} else {
			System.out.println("Task is completed successfuly -> " + this.numTasks);
			result = 25;
		}

		return result;
	}

}
