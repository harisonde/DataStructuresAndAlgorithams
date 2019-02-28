package com.jwt.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyTask extends RecursiveAction {
	int numTasks;

	public MyTask(int tasks) {
		this.numTasks = tasks;
	}

	@Override
	protected void compute() {
		if (this.numTasks > 25) {
			System.out.println("Splitting the work " + this.numTasks);
			List<RecursiveAction> taskList = new ArrayList<>();

			taskList.add(new MyTask(this.numTasks/2)); 
			taskList.add(new MyTask(this.numTasks/2));

			for(RecursiveAction  task: taskList) { 
				task.fork();
			}
		} else {
			System.out.println("Task is completed successfuly -> " + this.numTasks);
		}
	}

}
