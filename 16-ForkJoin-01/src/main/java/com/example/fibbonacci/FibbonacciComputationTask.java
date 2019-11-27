package com.example.fibbonacci;

import java.util.concurrent.RecursiveTask;

public class FibbonacciComputationTask extends RecursiveTask<Integer> {

	private static final long serialVersionUID = 1L;

	private final int number;

	public FibbonacciComputationTask(int number) {
		this.number = number;
	}

	public Integer compute() {

		// ?? Implement fibonnaci compute and task split
		if(number <= 1)
			return number;
		
		FibbonacciComputationTask f1 = new FibbonacciComputationTask(number-1);
		f1.fork();
		
		FibbonacciComputationTask f2 = new FibbonacciComputationTask(number-2);
		
		return f2.compute() + f1.join();
	}
}