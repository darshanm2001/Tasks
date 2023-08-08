package com.xworkz.poly.app.boot;

import com.xworkz.poly.app.Gate;
import com.xworkz.poly.app.IronGate;

public class GateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking Main in GateRunner");
         Gate ref=new IronGate();
         ref.open();
	}

}
