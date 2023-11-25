package com.xworkz.programmingTask;

import java.util.HashMap;
import java.util.Map;

public class DailyTask1 {
	
	public static void main(String[] args) {
        int[] array = {2, 3, 2, 6, 3, 5};

        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                // If the element is already in the map, increment its count
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the element is not in the map, add it with a count of 1
                frequencyMap.put(num, 1);
            }
        }

        // Query the frequency for specific elements
        int inputElement1 = 2;
        int inputElement2 = 6;

        System.out.println("Input: " + inputElement1);
        System.out.println("Output: " + frequencyMap.getOrDefault(inputElement1, 0));

        System.out.println("Input: " + inputElement2);
        System.out.println("Output: " + frequencyMap.getOrDefault(inputElement2, 0));
    }
}





