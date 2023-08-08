package com.xworkz.poly.app.boot;

import com.xworkz.poly.app.Ticket;
import com.xworkz.poly.app.TicketCollector;

public class TicketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking in main in TicketKiller");
		Ticket ticket=new TicketCollector();
		ticket.soldOut();

	}

}
