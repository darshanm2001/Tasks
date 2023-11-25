package com.xworkz.pair.current;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductRunnerrr {

	public static void main(String[] args) {
		System.out.println("Invoking main in ProductRunner");
		
		ProductDTO product=new ProductDTO("biscuit", 10, 01, 1, LocalDate.of(2023, 5, 01));
		ProductDTO product1=new ProductDTO("bread",40, 02, 2, LocalDate.of(2023, 6, 16));
		ProductDTO product2=new ProductDTO("chips", 100, 03, 10, LocalDate.of(2023, 04, 03));
		
		CompanyDTO company=new CompanyDTO("Infosys", "bangalore","sudha Murthy" , 5224552224554L);
		CompanyDTO company1=new CompanyDTO("Tata", "mumbai", "rathan Tata", 1452525664L);
		CompanyDTO company2=new CompanyDTO("wipro", "Delhi", "premji", 555824522366L);
		
		Map<ProductDTO, CompanyDTO> productAndCompany=new HashMap<ProductDTO, CompanyDTO>();
		productAndCompany.put(product, company);
		productAndCompany.put(product1, company1);
		productAndCompany.put(product2, company2);
		
		
		System.out.println("////////////////////////////////");
		
		Set<ProductDTO> products= productAndCompany.keySet();
		products.forEach(p->System.out.println(p));
		
		System.out.println("////////////////////////////////");
		
		Collection<CompanyDTO> companies= productAndCompany.values();
		companies.forEach(c->System.out.println(c));



	}

}
