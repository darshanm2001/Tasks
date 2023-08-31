package com.xworkz.boot;

import com.xworkz.app.Company;
import com.xworkz.app.MncCompany;

public class CompanyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new MncCompany();

		company.hireEmployee();
		company.developProduct();
		company.organizeTraining();
		company.approveLeave();
		company.reviewPerformance();
		company.fireEmployee();
		company.conductMeeting();
		company.submitReport();
		company.processPayroll();
		company.promoteEmployee();
	}



	}


