package com.xworkz.pair.current;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ComapanyAndPresidentRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ComapanyAndPresidentRunner ");
		
		
		CountryDTO countryDTO=new CountryDTO(01, "India");
		CountryDTO countryDTO1=new CountryDTO(02, "USA");
		CountryDTO countryDTO2=new CountryDTO(03, "Austrila");
		CountryDTO countryDTO3=new CountryDTO(04, "Srilanka");
		CountryDTO countryDTO4=new CountryDTO(05, "UK");
		
		
		PresidentDTO presidentDTO=new PresidentDTO(6, "Droupadi Murmu");
		PresidentDTO presidentDTO1=new PresidentDTO(7, "Biden");
		PresidentDTO presidentDTO2=new PresidentDTO(8, "Warner");
		PresidentDTO presidentDTO3=new PresidentDTO(9, "Lasith Malinga");
		PresidentDTO presidentDTO4=new PresidentDTO(10, "Rishi");
		
		Map<CountryDTO, PresidentDTO> countryAndPresident=new HashMap<CountryDTO, PresidentDTO>();
		countryAndPresident.put(countryDTO, presidentDTO);
		countryAndPresident.put(countryDTO1, presidentDTO1);
		countryAndPresident.put(countryDTO2, presidentDTO2);
		countryAndPresident.put(countryDTO3, presidentDTO3);
		countryAndPresident.put(countryDTO4, presidentDTO4);
		
		System.out.println("////////////////////////////////");
		
		Set<CountryDTO> countrySet= countryAndPresident.keySet();
		countrySet.forEach(c->System.out.println(c));
		
		System.out.println("//////////////////////////////////////////////////////////////////////");
		
		Collection<PresidentDTO> presidentvalues= countryAndPresident.values();
		presidentvalues.forEach(p->System.out.println(p));
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		Set<Entry<CountryDTO, PresidentDTO>> entrySet=countryAndPresident.entrySet();
		entrySet.forEach(r->System.out.println(r));
	
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		countryAndPresident.forEach((k,v)->System.out.println(k +":" + v));
		System.out.println("////////////////////////////////////////////////////////////////////////");
		
		Iterator<Entry<CountryDTO, PresidentDTO>> itr=entrySet.iterator();
		while(itr.hasNext()) {
			Entry<CountryDTO, PresidentDTO> ref2=itr.next();
			System.out.println(ref2);
			}
	}

}
