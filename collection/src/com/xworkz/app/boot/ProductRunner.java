package com.xworkz.app.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		System.out.println("invokinh main in ProductRunner");
		
		
		ProductDTO product1 = new ProductDTO(1, "Laptop", 1299.99, LocalDate.of(2023, 11, 15),
				LocalDate.of(2023, 10, 1), 0.15, "High-performance laptop with SSD", 50, 4, 25, 8, 12, 5, 5, 5,
				"ABC Electronics", 1.5, "Charger, Manual", "Intel Core i7", LocalDate.of(2023, 10, 1), "B07VXL3J5R",
				false, "India", "ModelX123", "SN12345", true, "2 Year Warranty", true, LocalDate.of(2023, 11, 18),
				LocalDate.of(2024, 1, 15));

				ProductDTO product2 = new ProductDTO(2, "Smartphone", 699.99, LocalDate.of(2023, 11, 20),
				LocalDate.of(2023, 10, 5), 0.1, "5G smartphone with dual camera", 100, 4, 50, 15, 18, 8, 7, 8,
				"Tech Innovations", 0.7, "Charger, Earphones", "Snapdragon 865", LocalDate.of(2023, 10, 5),
				"B08DJSS2RG", false, "China", "ModelS456", "SN67890", true, "1 Year Warranty", false,
				LocalDate.of(2023, 11, 25), LocalDate.of(2024, 2, 5));

				ProductDTO product3 = new ProductDTO(3, "Television", 899.99, LocalDate.of(2023, 12, 1),
				LocalDate.of(2023, 11, 1), 0.12, "4K Smart TV with HDR", 30, 5, 15, 10, 8, 5, 4, 3, "ElectroVision",
				30.0, "Remote, Stand", "LED TV", LocalDate.of(2023, 11, 1), "B09R345GDF", false, "SOUTH KOREA",
				"ModelTV789", "SN54321", true, "3 Year Warranty", true, LocalDate.of(2023, 12, 5),
				LocalDate.of(2024, 2, 1));

				ProductDTO product4 = new ProductDTO(4, "Headphones", 99.99, LocalDate.of(2023, 11, 18),
				LocalDate.of(2023, 10, 10), 0.2, "Wireless over-ear headphones", 50, 4, 25, 8, 12, 5, 5, 5,
				"SoundBliss", 0.5, "Charging Cable", "Bluetooth Headphones", LocalDate.of(2023, 10, 10), "B07HJGF56Y",
				false, "GERMANY", "ModelH123", "SN78901", true, "1 Year Warranty", true, LocalDate.of(2023, 11, 25),
				LocalDate.of(2024, 1, 15));

				ProductDTO product5 = new ProductDTO(5, "Coffee Maker", 49.99, LocalDate.of(2023, 10, 25),
				LocalDate.of(2023, 9, 1), 0.18, "Drip coffee maker with timer", 80, 3, 40, 12, 10, 6, 8, 4,
				"BrewMaster", 2.0, "Coffee Pot, Filters", "Drip Coffee Maker", LocalDate.of(2023, 9, 1), "B06XK3XQXQ",
				true, "INDIA", "ModelC456", "SN90123", false, "No Warranty", false, LocalDate.of(2023, 10, 1),
				LocalDate.of(2023, 11, 1));

				ProductDTO product6 = new ProductDTO(6, "Fitness Tracker", 39.99, LocalDate.of(2023, 11, 5),
				LocalDate.of(2023, 10, 1), 0.2, "Water-resistant fitness tracker", 120, 5, 60, 20, 18, 10, 12, 8,
				"FitTech", 0.1, "Charging Cable", "Fitness Tracker", LocalDate.of(2023, 10, 1), "B07VXL3J5R", false,
				"GERMANY", "ModelF123", "SN45678", true, "2 Year Warranty", true, LocalDate.of(2023, 11, 10),
				LocalDate.of(2023, 12, 5));

				ProductDTO product7 = new ProductDTO(7, "Refrigerator", 1499.99, LocalDate.of(2023, 12, 10),
				LocalDate.of(2023, 11, 1), 0.15, "French door refrigerator with ice maker", 40, 4, 20, 8, 12, 5, 5, 5,
				"CoolTech", 200.0, "Ice Tray, Shelves", "French Door Refrigerator", LocalDate.of(2023, 11, 1),
				"B09R34GHTY", true, "USA", "ModelR789", "SN87654", true, "3 Year Warranty", true,
				LocalDate.of(2023, 12, 15), LocalDate.of(2024, 3, 1));

				ProductDTO product8 = new ProductDTO(8, "Digital Camera", 799.99, LocalDate.of(2023, 11, 28),
				LocalDate.of(2023, 10, 15), 0.12, "Mirrorless digital camera with 4K recording", 60, 4, 30, 10, 15, 7,
				9, 6, "PhotoPro", 1.0, "Lens, Memory Card", "Mirrorless Camera", LocalDate.of(2023, 10, 15),
				"B08DJSS2RG", false, "JAPAN", "ModelD456", "SN87654", false, "No Warranty", false,
				LocalDate.of(2023, 12, 5), LocalDate.of(2024, 2, 1));

				ProductDTO product9 = new ProductDTO(9, "Gaming Console", 299.99, LocalDate.of(2023, 11, 12),
				LocalDate.of(2023, 10, 5), 0.25, "Next-gen gaming console", 90, 4, 45, 15, 20, 9, 8, 7, "GameMaster",
				3.0, "Controller, HDMI Cable", "Gaming Console", LocalDate.of(2023, 10, 5), "B07HJGF56Y", false,
				"CHINA", "ModelG123", "SN45678", true, "1 Year Warranty", true, LocalDate.of(2023, 11, 15),
				LocalDate.of(2023, 12, 5));

				ProductDTO product10 = new ProductDTO(10, "Smart Watch", 199.99, LocalDate.of(2023, 11, 18),
				LocalDate.of(2023, 10, 10), 0.18, "Fitness tracker with smartwatch features", 70, 3, 35, 12, 10, 7, 9,
				6, "TechGadget", 0.5, "Charging Cable", "Smart Watch", LocalDate.of(2023, 10, 10), "B06XK3XQXQ", true,
				"USA", "ModelSW456", "SN90123", false, "No Warranty", false, LocalDate.of(2023, 11, 1),
				LocalDate.of(2023, 12, 1));

				Collection<ProductDTO> collections = new ArrayList<ProductDTO>();
				collections.add(product1);
				collections.add(product2);
				collections.add(product3);
				collections.add(product4);
				collections.add(product5);
				collections.add(product6);
				collections.add(product7);
				collections.add(product8);
				collections.add(product9);
				collections.add(product10);

				System.out.println("Id Ascending...................................................");
				Comparator<ProductDTO> productsAsc = (t1, t2) -> Integer.compare(t1.getId(), t2.getId());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(productsAsc).forEach(ref -> System.out.println(ref));
				System.out.println("Id descending........................................................");
				Comparator<ProductDTO> productsDesc = (t1, t2) -> Integer.compare(t2.getId(), t1.getId());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(productsDesc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Name Ascending...................................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(Comparator.comparing(ProductDTO::getName)).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Name Descending...................................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted((t1, t2) -> t2.getName().compareTo(t1.getName())).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Price Ascending...................................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(Comparator.comparingDouble(ProductDTO::getPrice)).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Price Descending...................................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted((t1, t2) -> Double.compare(t2.getPrice(), t1.getPrice()))
				.forEach(ref11 -> System.out.println(ref11));

				System.out.println("Expiry Date Ascending...........................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(Comparator.comparing(ProductDTO::getExpiryDate)).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Expiry Date Descending..........................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted((t1, t2) -> t2.getExpiryDate().compareTo(t1.getExpiryDate()))
				.forEach(ref11 -> System.out.println(ref11));

				System.out.println("Manufacture Date Ascending.....................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(Comparator.comparing(ProductDTO::getManufactureDate)).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Manufacture Date Descending...................................");
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted((t1, t2) -> t2.getManufactureDate().compareTo(t1.getManufactureDate()))
				.forEach(ref11 -> System.out.println(ref11));

				System.out.println("Discount Ascending............................................");
				Comparator<ProductDTO> discountAscComparator = Comparator.comparingDouble(ProductDTO::getDiscount);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(discountAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("Discount Descending...........................................");
				Comparator<ProductDTO> discountDescComparator = (t1, t2) -> Double.compare(t2.getDiscount(), t1.getDiscount());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(discountDescComparator).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Description Ascending..........................................");
				Comparator<ProductDTO> descriptionAscComparator = Comparator.comparing(ProductDTO::getDescription);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(descriptionAscComparator).forEach(ref2 -> System.out.println(ref2));

				System.out.println("Description Descending.........................................");
				Comparator<ProductDTO> descriptionDescComparator = (t1, t2) -> t2.getDescription()
				.compareTo(t1.getDescription());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(descriptionDescComparator).forEach(ref3 -> System.out.println(ref3));

				System.out.println("Quantity Ascending.............................................");
				Comparator<ProductDTO> quantityAscComparator = Comparator.comparingInt(ProductDTO::getQuantity);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(quantityAscComparator).forEach(ref4 -> System.out.println(ref4));

				System.out.println("Quantity Descending............................................");
				Comparator<ProductDTO> quantityDescComparator = (t1, t2) -> Integer.compare(t2.getQuantity(), t1.getQuantity());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(quantityDescComparator).forEach(ref5 -> System.out.println(ref5));

				System.out.println("Rating Ascending...............................................");
				Comparator<ProductDTO> ratingAscComparator = Comparator.comparingDouble(ProductDTO::getRating);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(ratingAscComparator).forEach(ref6 -> System.out.println(ref6));

				System.out.println("Rating Descending..............................................");
				Comparator<ProductDTO> ratingDescComparator = (t1, t2) -> Double.compare(t2.getRating(), t1.getRating());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(ratingDescComparator).forEach(ref7 -> System.out.println(ref7));

				System.out.println("People Rated Ascending.........................................");
				Comparator<ProductDTO> peopleRatedAscComparator = Comparator.comparingInt(ProductDTO::getPeopleRated);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRatedAscComparator).forEach(ref8 -> System.out.println(ref8));

				System.out.println("People Rated Descending........................................");
				Comparator<ProductDTO> peopleRatedDescComparator = (t1, t2) -> Integer.compare(t2.getPeopleRated(),
				t1.getPeopleRated());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRatedDescComparator).forEach(ref9 -> System.out.println(ref9));

				System.out.println("People Rated 5 Ascending......................................");
				Comparator<ProductDTO> peopleRated5AscComparator = Comparator.comparingInt(ProductDTO::getPeopleRatedFive);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated5AscComparator).forEach(ref10 -> System.out.println(ref10));

				System.out.println("People Rated 5 Descending.....................................");
				Comparator<ProductDTO> peopleRated5DescComparator = (t1, t2) -> Integer.compare(t2.getPeopleRatedFive(),
				t1.getPeopleRatedFive());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated5DescComparator).forEach(ref11 -> System.out.println(ref11));

				System.out.println("People Rated 4 Ascending......................................");
				Comparator<ProductDTO> peopleRated4AscComparator = Comparator.comparingInt(ProductDTO::getPeopleRatedFour);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated4AscComparator).forEach(ref10 -> System.out.println(ref10));

				System.out.println("People Rated 4 Descending.....................................");
				Comparator<ProductDTO> peopleRated4DescComparator = (t1, t2) -> Integer.compare(t2.getPeopleRatedFour(),
				t1.getPeopleRatedFour());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated4DescComparator).forEach(ref11 -> System.out.println(ref11));

				System.out.println("People Rated 3 Ascending......................................");
				Comparator<ProductDTO> peopleRate3AscComparator = Comparator.comparingInt(ProductDTO::getPeopleRatedThree);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRate3AscComparator).forEach(ref10 -> System.out.println(ref10));

				System.out.println("People Rated 3 Descending.....................................");
				Comparator<ProductDTO> peopleRated3DescComparator = (t1, t2) -> Integer.compare(t2.getPeopleRatedThree(),
				t1.getPeopleRatedThree());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated3DescComparator).forEach(ref11 -> System.out.println(ref11));

				System.out.println("People Rated 2 Ascending......................................");
				Comparator<ProductDTO> peopleRated2AscComparator = Comparator.comparingInt(ProductDTO::getPeopleRatedTwo);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated2AscComparator).forEach(ref10 -> System.out.println(ref10));

				System.out.println("People Rated 2 Descending.....................................");
				Comparator<ProductDTO> peopleRated2DescComparator = (t1, t2) -> Integer.compare(t2.getPeopleRatedTwo(),
				t1.getPeopleRatedTwo());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated2DescComparator).forEach(ref11 -> System.out.println(ref11));

				System.out.println("People Rated 1 Ascending......................................");
				Comparator<ProductDTO> peopleRated1AscComparator = Comparator.comparingInt(ProductDTO::getPeopleRatedOne);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated1AscComparator).forEach(ref10 -> System.out.println(ref10));

				System.out.println("People Rated 1 Descending.....................................");
				Comparator<ProductDTO> peopleRated1DescComparator = (t1, t2) -> Integer.compare(t2.getPeopleRatedOne(),
				t1.getPeopleRatedOne());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleRated1DescComparator).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Packer Ascending...................................................");
				Comparator<ProductDTO> packerAsc = (t1, t2) -> t1.getPacker().compareTo(t2.getPacker());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(packerAsc).forEach(ref12 -> System.out.println(ref12));

				System.out.println("Packer Descending...................................................");
				Comparator<ProductDTO> packerDesc = (t1, t2) -> t2.getPacker().compareTo(t1.getPacker());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(packerDesc).forEach(ref12 -> System.out.println(ref12));

				System.out.println("Item Weight Ascending............................................");
				Comparator<ProductDTO> itemWeightAsc = Comparator.comparingDouble(ProductDTO::getItemWeight);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemWeightAsc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Item Weight Descending...........................................");
				Comparator<ProductDTO> itemWeightDesc = (t1, t2) -> Double.compare(t2.getItemWeight(), t1.getItemWeight());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemWeightDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Included Ascending..................................................");
				Comparator<ProductDTO> includedAsc = (t1, t2) -> t1.getIncluded().compareTo(t2.getIncluded());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(includedAsc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Included Descending.................................................");
				Comparator<ProductDTO> includedDesc = (t1, t2) -> t2.getIncluded().compareTo(t1.getIncluded());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(includedDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Generic Name Ascending..............................................");
				Comparator<ProductDTO> genericNameAsc = (t1, t2) -> t1.getGenericName().compareTo(t2.getGenericName());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(genericNameAsc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Generic Name Descending.............................................");
				Comparator<ProductDTO> genericNameDesc = (t1, t2) -> t2.getGenericName().compareTo(t1.getGenericName());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(genericNameDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Date First Available Ascending...................................");
				Comparator<ProductDTO> dateFirstAvailableAsc = (t1, t2) -> t1.getDateFirstAvailable()
				.compareTo(t2.getDateFirstAvailable());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(dateFirstAvailableAsc).forEach(ref -> System.out.println(ref));

				System.out.println("Date First Available Descending...................................");
				Comparator<ProductDTO> dateFirstAvailableDesc = (t1, t2) -> t2.getDateFirstAvailable()
				.compareTo(t1.getDateFirstAvailable());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(dateFirstAvailableDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("ASIN Ascending....................................................");
				Comparator<ProductDTO> asinAsc = (t1, t2) -> t1.getAsin().compareTo(t2.getAsin());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(asinAsc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("ASIN Descending...................................................");
				Comparator<ProductDTO> asinDesc = (t1, t2) -> t2.getAsin().compareTo(t1.getAsin());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(asinDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Damaged Ascending.................................................");
				Comparator<ProductDTO> damagedAsc = Comparator.comparing(ProductDTO::isDamaged);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(damagedAsc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Damaged Descending................................................");
				Comparator<ProductDTO> damagedDesc = (t1, t2) -> Boolean.compare(t2.isDamaged(), t1.isDamaged());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(damagedDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Country of Origin Ascending........................................");
				Comparator<ProductDTO> countryOfOriginAsc = (t1, t2) -> t1.getCountryOfOrigin()
				.compareTo(t2.getCountryOfOrigin());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(countryOfOriginAsc).forEach(ref1 -> System.out.println(ref1));

				System.out.println("Country of Origin Descending.......................................");
				Comparator<ProductDTO> countryOfOriginDesc = (t1, t2) -> t2.getCountryOfOrigin()
				.compareTo(t1.getCountryOfOrigin());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(countryOfOriginDesc).forEach(ref11 -> System.out.println(ref11));

				System.out.println("Model No Ascending...............................................");
				Comparator<ProductDTO> modelNoAsc = (t1, t2) -> t1.getModelNo().compareTo(t2.getModelNo());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(modelNoAsc).forEach(System.out::println);

				System.out.println("Model No Descending..............................................");
				Comparator<ProductDTO> modelNoDesc = (t1, t2) -> t2.getModelNo().compareTo(t1.getModelNo());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(modelNoDesc).forEach(System.out::println);

				System.out.println("SerialNo Ascending....................................................");
				Comparator<ProductDTO> serialNoAscComparator = Comparator.comparing(ProductDTO::getSerialNo);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(serialNoAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("SerialNo desc....................................................");
				Comparator<ProductDTO> serialNoDescComparator = (t1, t2) -> t2.getSerialNo().compareTo(t1.getSerialNo());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(serialNoDescComparator).forEach(ref -> System.out.println(ref));

				System.out.println("returnable Ascending....................................................");
				Comparator<ProductDTO> returnableAscComparator = Comparator.comparing(ProductDTO::isReturnable);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(returnableAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("returnable desc....................................................");
				Comparator<ProductDTO> returnableDescComparator = (t1, t2) -> Boolean.compare(t2.isReturnable(),
				t1.isReturnable());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(returnableDescComparator).forEach(ref -> System.out.println(ref));

				System.out.println("warrenty Ascending....................................................");
				Comparator<ProductDTO> warrantyAscComparator = Comparator.comparing(ProductDTO::getWarranty);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(warrantyAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("warrenty desc....................................................");
				Comparator<ProductDTO> warrantyDescComparator = (t1, t2) -> t2.getWarranty().compareTo(t1.getWarranty());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(warrantyDescComparator).forEach(ref -> System.out.println(ref));

				System.out.println("primeDelivery Ascending....................................................");
				Comparator<ProductDTO> primeDeliveryAscComparator = Comparator.comparing(ProductDTO::isPrimeDelivery);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(primeDeliveryAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("primeDelivery descend....................................................");
				Comparator<ProductDTO> primeDeliveryDescComparator = (t1, t2) -> Boolean.compare(t2.isPrimeDelivery(),
				t1.isPrimeDelivery());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(primeDeliveryDescComparator).forEach(ref -> System.out.println(ref));

				System.out.println("expectedDate Ascending....................................................");
				Comparator<ProductDTO> deliveryExpectedDateAscComparator = Comparator
				.comparing(ProductDTO::getDeliveryExpectedDate);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(deliveryExpectedDateAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("expectedDate descend....................................................");
				Comparator<ProductDTO> deliveryExpectedDateDescComparator = (t1, t2) -> t2.getDeliveryExpectedDate()
				.compareTo(t1.getDeliveryExpectedDate());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(deliveryExpectedDateDescComparator).forEach(ref -> System.out.println(ref));

				System.out.println("returnDate Ascending....................................................");
				Comparator<ProductDTO> returnDateAscComparator = Comparator.comparing(ProductDTO::getReturnDate);
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(returnDateAscComparator).forEach(ref -> System.out.println(ref));

				System.out.println("returnDate descend....................................................");
				Comparator<ProductDTO> returnDateDescComparator = (t1, t2) -> t2.getReturnDate().compareTo(t1.getReturnDate());
				Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(returnDateDescComparator).forEach(ref -> System.out.println(ref));

				System.out.println("**************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
				    System.out.println("Compare using 2 properties");


				    Comparator<ProductDTO> nameAndAsin=(t1,t2)->t1.getName().compareTo(t2.getAsin());
				    collections.stream().sorted(nameAndAsin).forEach(ref->System.out.println(ref));
				    
				    System.out.println("==============================================================");
				    
				    Comparator<ProductDTO> priceAndId=(t1,t2)->t1.getIncluded().compareTo(t2.getGenericName());
				    collections.stream().sorted(priceAndId).forEach(D->System.out.println(D));
				   
				    System.out.println("==============================================================");
				    
				    
				    Comparator<ProductDTO> nameAndPacker=(t1,t2)->t1.getName().compareTo(t2.getPacker());
				    collections.stream().sorted(nameAndPacker ).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    
				    Comparator<ProductDTO> descAndCountry=(t1,t2)->t1.getDescription().compareTo(t2.getCountryOfOrigin());
				    collections.stream().sorted(descAndCountry).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    Comparator<ProductDTO> modelAndSerial=(t1,t2)->t1.getModelNo().compareTo(t2.getSerialNo());
				    collections.stream().sorted(modelAndSerial).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    

				    Comparator<ProductDTO> priceAndQuantity=(t1,t2)->Integer.compare(t1.getId(), t2.getQuantity());
				    collections.stream().sorted(priceAndQuantity).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    Comparator<ProductDTO> ratingAndPeoplerated=(t1,t2)->Integer.compare(t1.getRating(), t2.getPeopleRated());
				    collections.stream().sorted(ratingAndPeoplerated).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    Comparator<ProductDTO> idAndRating=(t1,t2)->Integer.compare(t1.getId(), t2.getRating());
				    collections.stream().sorted(idAndRating).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    Comparator<ProductDTO> priceAndDiscount=(t1,t2)->Double.compare(t1.getPrice(), t2.getDiscount());
				    collections.stream().sorted(priceAndDiscount).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    Comparator<ProductDTO> itemweightAndPrice=(t1,t2)->Double.compare(t1.getItemWeight(), t2.getPrice());
				    collections.stream().sorted(itemweightAndPrice).forEach(n->System.out.println(n));
				   
				    System.out.println("==============================================================");
				    
				    
				    System.out.println(
				    		"**************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
				    		System.out.println("Compare using 3 properties");

				    		collections.stream()
				    		.sorted(modelNoAsc.thenComparing(discountAscComparator).thenComparing(warrantyAscComparator))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream().sorted(modelNoAsc.thenComparing(packerAsc).thenComparing(productsAsc))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream().sorted(modelNoAsc.thenComparing(discountAscComparator).thenComparing(productsAsc))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream().sorted(modelNoAsc.thenComparing(ratingAscComparator).thenComparing(productsAsc))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream()
				    		.sorted(ratingAscComparator.thenComparing(discountAscComparator).thenComparing(warrantyAscComparator))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream()
				    		.sorted(ratingAscComparator.thenComparing(genericNameDesc).thenComparing(warrantyAscComparator))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream()
				    		.sorted(genericNameDesc.thenComparing(discountAscComparator).thenComparing(dateFirstAvailableAsc))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream()
				    		.sorted(peopleRated1AscComparator.thenComparing(genericNameDesc).thenComparing(returnableAscComparator))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream().sorted(
				    		productsAsc.thenComparing(discountAscComparator).thenComparing(deliveryExpectedDateAscComparator))
				    		.forEach(ref -> System.out.println(ref));

				    		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				    		collections.stream().sorted(productsAsc.thenComparing(quantityAscComparator).thenComparing(productsAsc))
				    		.forEach(ref -> System.out.println(ref));

				    		Collection<ProductDTO> ref1 = collections.stream().collect(Collectors.toList());
				    		System.out.println(ref1);

				    		
				    
}

}
