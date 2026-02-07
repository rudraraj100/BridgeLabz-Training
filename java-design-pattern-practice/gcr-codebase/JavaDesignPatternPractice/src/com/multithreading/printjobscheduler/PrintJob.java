package com.multithreading.printjobscheduler;

public class PrintJob implements Runnable{
	
	private String jobName;
	private int totalPages;
	private int priority;
	
	

	public PrintJob(String jobName, int totalPages, int priority) {
		
		this.jobName = jobName;
		this.totalPages = totalPages;
		this.priority = Math.max(1, Math.min(10, priority)); // clamp between 1–10
    }

    public int getPriority() {
	return priority;
    }

    @Override
    public void run() {
	Thread current = Thread.currentThread();
	current.setPriority(priority); // Set thread priority

	String priorityLabel = getPriorityLabel(priority);

	System.out.println("[" + priorityLabel + "] Starting job: " + getJobName() + " (" + totalPages + " pages, priority "
		+ priority + ")");

	try {
	    for (int page = 1; page <= totalPages; page++) {
		// Simulate printing one page
		Thread.sleep(100);

		System.out.printf("[%s] Printing %s - Page %d of %d%n", priorityLabel, getJobName(), page, totalPages);

		// Small chance (makes priority effect more visible)
		if (Math.random() < 0.15) {
		    Thread.yield();
		}
	    }

	    System.out.println("[" + priorityLabel + "] Completed: " + getJobName());

	} catch (InterruptedException e) {
	    System.out.println("[" + getJobName() + "] Printing interrupted!");
	    Thread.currentThread().interrupt();
	}
    }

    private String getPriorityLabel(int prio) {
	if (prio >= 8)
	    return "High Priority";
	if (prio >= 5)
	    return "Medium Priority";
	return "Low Priority";
    }

    public String getJobName() {
	return jobName;
    }
}