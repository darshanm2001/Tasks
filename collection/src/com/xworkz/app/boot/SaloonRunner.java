package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.SaloonItemDTO;

public class SaloonRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SaloonRunner...");

		Collection<SaloonItemDTO> saloons = new ArrayList<>();
		SaloonItemDTO hairdryer = new SaloonItemDTO(1, "Hairdryers", 50.0, "Drying hair", true);
		SaloonItemDTO hairStraightener = new SaloonItemDTO(2, "Hair straighteners", 75.0, "Straightening hair", true);
		SaloonItemDTO curlingIron = new SaloonItemDTO(3, "Curling irons", 60.0, "Curling hair", true);
		SaloonItemDTO shampooChair = new SaloonItemDTO(4, "Shampoo chairs", 120.0, "Shampooing hair", false);
		SaloonItemDTO stylingChair = new SaloonItemDTO(5, "Styling chairs", 100.0, "Styling hair", false);
		SaloonItemDTO barberChair = new SaloonItemDTO(6, "Barber chairs", 110.0, "Barber services", true);
		SaloonItemDTO shampooBowl = new SaloonItemDTO(7, "Shampoo bowls", 80.0, "Hair washing", false);
		SaloonItemDTO mirror = new SaloonItemDTO(8, "Mirrors", 40.0, "Viewing reflection", true);
		SaloonItemDTO towels = new SaloonItemDTO(9, "Towels", 20.0, "Drying hands and hair", true);
		SaloonItemDTO cuttingCape = new SaloonItemDTO(10, "Cutting capes", 30.0, "Protecting clothes", true);

		saloons.add(hairdryer);
		saloons.add(hairStraightener);
		saloons.add(curlingIron);
		saloons.add(shampooChair);
		saloons.add(stylingChair);
		saloons.add(barberChair);
		saloons.add(shampooBowl);
		saloons.add(mirror);
		saloons.add(towels);
		saloons.add(cuttingCape);

		int count = 0;
		for (SaloonItemDTO ref : saloons) {
		System.out.println("Name:" + ref.getName());
		count++;
		}
		System.out.println("Total:" + count);
		System.out.println();

		Collection<SaloonItemDTO> saloons1 = new ArrayList<>();
		SaloonItemDTO scissors = new SaloonItemDTO(13, "Scissors", 10.0, "Cutting hair", true);
		SaloonItemDTO razors = new SaloonItemDTO(14, "Razors", 12.0, "Shaving", true);
		boolean set1 = saloons.containsAll(saloons1);
		System.out.println(set1);
		System.out.println();

		boolean set2 = saloons.contains(scissors);
		System.out.println(set2);
		System.out.println();

		Collection<SaloonItemDTO> saloons2 = new ArrayList<>();
		SaloonItemDTO stylingProducts = new SaloonItemDTO(11, "Styling products", 15.0, "Hair styling", true);
		SaloonItemDTO hairColorProducts = new SaloonItemDTO(12,  "Hair color products", 25.0, "Hair coloring", true);
		boolean set3 = saloons.removeAll(saloons2);
		System.out.println(set3);
		System.out.println();

		boolean set4 = saloons.remove(hairColorProducts);
		System.out.println(set4);
		System.out.println();

		Iterator<SaloonItemDTO> itr = saloons.iterator();
		while (itr.hasNext()) {
		SaloonItemDTO saloonItemDTO = itr.next();
		System.out.println("Name: " + saloonItemDTO.getName());
		}

		}
		}


