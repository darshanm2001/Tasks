package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {
	
	private String publisher;
	private String lamg;
	private int pages;
	private double cost;
	
	
	public void name() {
		
	}
	
	public NewspaperDTO(String publisher, String lamg, int pages, double cost) {
		super();
		this.publisher = publisher;
		this.lamg = lamg;
		this.pages = pages;
		this.cost = cost;
	}
	
	private void eqals() {
		

	}
	

	@Override
	public String toString() {
		return "NewspaperDTO [publisher=" + publisher + ", lamg=" + lamg + ", pages=" + pages + ", cost=" + cost + "]";
	}

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLamg() {
		return lamg;
	}
	public void setLamg(String lamg) {
		this.lamg = lamg;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	

}
