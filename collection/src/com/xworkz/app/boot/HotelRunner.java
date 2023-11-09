package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HotelRunner...");

		Collection<HotelDTO> hotelCollection = new ArrayList<>();

		HotelDTO indiaHotel1 = new HotelDTO(1, "The Taj Mahal Palace", "Tata Group", 20.25, "India");
		HotelDTO indiaHotel2 = new HotelDTO(2, "The Oberoi Udaivilas", "EIH Limited", 15.80, "India");
		HotelDTO indiaHotel3 = new HotelDTO(3, "Leela palace", "Leela palaces", 18.50, "India");

		HotelDTO sriLankaHotel1 = new HotelDTO(4, "Amangalla", "Aman resorts", 15.25, "Sri lanka");
		HotelDTO sriLankaHotel2 = new HotelDTO(5, "Shangri-La's Resort & Spa", "Shangri-La's hotels", 12.00,
		"Sri lanka");
		HotelDTO sriLankaHotel3 = new HotelDTO(6, "Anantara Peace Haven Tangalle Resort", "Anantara brand", 19.00,
		"Sri lanka");

		HotelDTO usaHotel1 = new HotelDTO(7, "The Ritz-Carlton", "Marriot International", 25.5, "USA");
		HotelDTO usaHotel2 = new HotelDTO(8, "The Beverly Hills Hotel", "Dorchester collection", 30, "USA");

		HotelDTO ukHotel1 = new HotelDTO(9, "The Ritz London", "Fredrich Barclay and David Barclay", 21.50, "UK");
		HotelDTO ukHotel2 = new HotelDTO(10, "The Dorchester", "Dorchester collection", 25.00, "UK");

		hotelCollection.add(indiaHotel1);
		hotelCollection.add(indiaHotel2);
		hotelCollection.add(indiaHotel3);
		hotelCollection.add(sriLankaHotel1);
		hotelCollection.add(sriLankaHotel2);
		hotelCollection.add(sriLankaHotel3);
		hotelCollection.add(usaHotel1);
		hotelCollection.add(usaHotel2);
		hotelCollection.add(ukHotel1);
		hotelCollection.add(ukHotel2);

		System.out.println("All hotels of India--------");
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equalsIgnoreCase("India")).forEach(hotel -> System.out.println(hotel.getName()));

		System.out.println();
		System.out.println("All hotels of Sri Lanka------");
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equalsIgnoreCase("Sri Lanka")).forEach(hotel -> System.out.println(hotel.getName()));

		System.out.println();
		System.out.println("Owner names----");
		List<String> ownerNames = hotelCollection.stream().map(HotelDTO::getOwnerName).collect(Collectors.toList());
		ownerNames.forEach(ownerName -> System.out.println(ownerName));

		System.out.println();
		System.out.println("Gst----");
		hotelCollection.stream().map(HotelDTO::getGst).forEach(gst -> System.out.println(gst));

		System.out.println();
		System.out.println("Get only ID if the location is UK-----");
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equalsIgnoreCase("UK")).map(HotelDTO::getId).forEach(id -> System.out.println(id));

		System.out.println();
		System.out.println("Get only owner names if the location is USA-----");
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equalsIgnoreCase("USA")).map(HotelDTO::getOwnerName).forEach(ownerName -> System.out.println(ownerName));
		}
		}