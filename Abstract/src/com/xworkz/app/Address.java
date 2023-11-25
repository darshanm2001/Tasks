package com.xworkz.app;

public class Address {
	
	
	
	    private String street;
	    private String city;
	    private String state;
	    private String postalCode;

	    public Address(String street, String city, String state, String postalCode) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.postalCode = postalCode;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getState() {
	        return state;
	    }

	    public String getPostalCode() {
	        return postalCode;
	    }
	}

	class Person {
	    private String name;
	    private int age;
	    private Address address;

	    public Person(String name, int age, Address address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    public String getName() { 
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public Address getAddress() {
	        return address;
	    }
	

	
	    public static void main(String[] args) {
	        Address address = new Address("main road", "banglore ", "KA", "12345");
	        Person person = new Person("John", 30, address);

	     
	        System.out.println("Person's Address: " +   person.getAddress().getCity() + ", " +person.getAddress().getStreet()+" " +person.getAddress().getState() + " " + person.getAddress().getPostalCode());
	    }
	    


}
