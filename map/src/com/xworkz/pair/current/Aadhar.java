package com.xworkz.pair.current;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aadhar {

	public static void main(String... args) {

		Map<String, Long> nameAndNumber = new HashMap<String, Long>();
		System.out.println(nameAndNumber.isEmpty());
		nameAndNumber.put("Darshan", 805085678442L);
		nameAndNumber.put("Rahul", 80567841225L);
		nameAndNumber.put("Karthik", 123456789L);
		nameAndNumber.put("Vijay", 987654321L);
		nameAndNumber.put("kiran", 5896743215L);
		nameAndNumber.put("om", 805085678442L);
		nameAndNumber.put("vinay", 778899332204L);
		nameAndNumber.put("rohan", 33221144545L);
		nameAndNumber.put("veeresh", 4477889955L);
		nameAndNumber.put("abhi", 00225543215L);

		System.out.println(nameAndNumber.size());
		System.out.println(nameAndNumber.isEmpty());

		Set<String> nameSet = nameAndNumber.keySet();
		nameSet.forEach(n -> System.out.println(n));

		System.out.println("////////////////////////");

		Collection<Long> numbers = nameAndNumber.values();
		numbers.forEach(l -> System.out.println(l));

	}

}
