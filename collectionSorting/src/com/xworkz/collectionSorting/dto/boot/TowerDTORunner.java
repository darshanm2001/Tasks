package com.xworkz.collectionSorting.dto.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collectionSorting.dto.app.TowerDTO;

public class TowerDTORunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in TheaterDTORunner");

        TowerDTO tower1 = new TowerDTO("Eiffel Tower", 330, true, "Paris");
        TowerDTO tower2 = new TowerDTO("CN Tower", 553, true, "Toronto");
        TowerDTO tower3 = new TowerDTO("Tokyo Skytree", 634, true, "Tokyo");
        TowerDTO tower4 = new TowerDTO("Petronas Towers", 452, false, "Kuala Lumpur");
        TowerDTO tower5 = new TowerDTO("Burj Khalifa", 828, true, "Dubai");

        Collection<TowerDTO> towers = new LinkedList<TowerDTO>();
        towers.add(tower1);
        towers.add(tower2);
        towers.add(tower3);
        towers.add(tower4);
        towers.add(tower5);

       

        towers.stream().sorted().forEach(p -> System.out.println(p));
    }
}
