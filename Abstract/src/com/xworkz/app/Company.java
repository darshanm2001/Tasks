package com.xworkz.app;

public abstract class Company {
	public void hireEmployee() {
        System.out.println("Invoking company in hireEmployee");
    }

    public void fireEmployee() {
        System.out.println("Invoking company in fireEmployee");
    }

    public void conductMeeting() {
        System.out.println("Invoking company in conductMeeting");
    }

    public void submitReport() {
        System.out.println("Invoking company in submitReport");
    }

    public void processPayroll() {
        System.out.println("Invoking company in processPayroll");
    }

    public abstract void developProduct();

    public abstract void promoteEmployee();

    public abstract void organizeTraining();

    public abstract void approveLeave();

    public abstract void reviewPerformance();

}
