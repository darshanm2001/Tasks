package com.xworkz.collectionSorting.dto.boot;

import java.util.LinkedList;
import java.util.Collection;

import com.xworkz.collectionSorting.dto.app.OceanDTO;

public class OceanDTORunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in OceanDTORunner");

        OceanDTO ocean1 = new OceanDTO("Atlantic Ocean", 3000.0, true, "North Atlantic");
        OceanDTO ocean2 = new OceanDTO("Indian Ocean", 4000.0, true, "Indian Subcontinent");
        OceanDTO ocean3 = new OceanDTO("Pacific Ocean", 6000.0, true, "Pacific Rim");
        OceanDTO ocean4 = new OceanDTO("Arctic Ocean", 1200.0, true, "Arctic Region");
        OceanDTO ocean5 = new OceanDTO("Southern Ocean", 4500.0, true, "Southern Hemisphere");

        Collection<OceanDTO> oceans = new LinkedList<>();
        oceans.add(ocean1);
        oceans.add(ocean2);
        oceans.add(ocean3);
        oceans.add(ocean4);
        oceans.add(ocean5);

     

        oceans.stream().sorted().forEach(p -> System.out.println(p));
    }
}
