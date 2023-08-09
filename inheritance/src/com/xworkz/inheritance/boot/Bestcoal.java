package com.xworkz.inheritance.boot;

public class Bestcoal extends Coal{

	public Bestcoal() {
		System.out.println("invoking no arg in bestcoal");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void burn() {
		System.out.println("invoking burn in Bestcoal");
	}

}
