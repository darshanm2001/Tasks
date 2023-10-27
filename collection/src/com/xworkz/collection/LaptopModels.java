package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {
	
	 public static void main(String[] args) {
	        Collection<String> laptopModels = new ArrayList<>();
	        laptopModels.add("Dell XPS 13");
	        laptopModels.add("HP Spectre x360");
	        laptopModels.add("MacBook Air");
	        laptopModels.add("Lenovo ThinkPad X1 Carbon");
	        laptopModels.add("Asus ROG Zephyrus G14");
	        laptopModels.add("Acer Predator Helios 300");
	        laptopModels.add("Microsoft Surface Laptop 4");
	        laptopModels.add("LG Gram");
	        laptopModels.add("Razer Blade 15");
	        laptopModels.add("MSI GS66 Stealth");
	        laptopModels.add("Alienware m15 R6");
	        laptopModels.add("Samsung Galaxy Book Pro");
	        laptopModels.add("Huawei MateBook X Pro");
	        laptopModels.add("LG UltraGear");
	        laptopModels.add("Acer Aspire 5");
	        laptopModels.add("HP Envy x360");
	        laptopModels.add("Lenovo Legion 5");
	        laptopModels.add("Asus TUF Gaming A15");
	        laptopModels.add("MacBook Pro");
	        laptopModels.add("Dell Inspiron 14");
	        laptopModels.add("HP Omen 15");
	        laptopModels.add("Lenovo Yoga C740");
	        laptopModels.add("Microsoft Surface Pro 7");
	        laptopModels.add("Asus VivoBook S15");
	        laptopModels.add("Acer Swift 3");
	        laptopModels.add("Google Pixelbook Go");
	        laptopModels.add("MSI Prestige 14");
	        laptopModels.add("Razer Blade Pro 17");
	        laptopModels.add("Alienware Area-51m");
	        laptopModels.add("HP ZBook Fury");
	        laptopModels.add("Lenovo Chromebook Duet");
	        laptopModels.add("Acer Chromebook Spin 713");
	        laptopModels.add("Dell G3 15");
	        laptopModels.add("Asus ROG Zephyrus M16");
	        laptopModels.add("Apple MacBook Air M2");
	        laptopModels.add("Lenovo IdeaPad 3");
	        laptopModels.add("Dell XPS 15");
	        laptopModels.add("HP Pavilion x360");
	        laptopModels.add("Acer Nitro 5");
	        laptopModels.add("Lenovo ThinkPad X1 Yoga");
	        laptopModels.add("Asus ZenBook 14");
	        laptopModels.add("Razer Blade Stealth");
	        laptopModels.add("Alienware m17 R4");
	        laptopModels.add("HP EliteBook 840");
	        laptopModels.add("Microsoft Surface Laptop Go");
	        laptopModels.add("LG Gram 17");
	        laptopModels.add("Dell Precision 5560");
	        laptopModels.add("Acer Aspire 7");
	        laptopModels.add("Lenovo Legion 7");
	        laptopModels.add("Asus ROG Flow Z13");
	        laptopModels.add("Samsung Galaxy Book Go");
	        
	        System.out.println("Total: " + laptopModels.size());
	        
	        Iterator<String> itr = laptopModels.iterator();
	        while(itr.hasNext()) {
	        	String models=itr.next();
	        	System.out.println("Models :" + models);
	        }

	 }
}
