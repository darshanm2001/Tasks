package com.xworkz.collectionSorting.dto.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.collectionSorting.dto.app.IceCreamDTO;


public class IceCreamRunner {
public static void main(String[] args) {
System.out.println("Invoking main in IceCreamRunner");
IceCreamDTO ice1 = new IceCreamDTO("Strawberry", "Cone", 2000.00, "Pink", LocalDate.of(2023, 10, 10));
IceCreamDTO ice2 = new IceCreamDTO("Chocolate", "Cup", 450000.00, "Brown", LocalDate.of(2023, 11, 15));
IceCreamDTO ice3 = new IceCreamDTO("Vanilla", "Cone", 500005.00, "White", LocalDate.of(2023, 9, 5));
IceCreamDTO ice4 = new IceCreamDTO("Mango", "Cup", 400000.00, "Yellow", LocalDate.of(2023, 12, 20));
IceCreamDTO ice5 = new IceCreamDTO("Butterscotch", "Cone", 408520.00, "Golden", LocalDate.of(2023, 8, 8));

Stream.of(ice1,ice2,ice3,ice4,ice5).sorted().forEach(ref->System.out.println(ref));
System.out.println("===========================");

Comparator<IceCreamDTO> creams=(t1,t2)->{
return t1.getFlavour().compareTo(t2.getFlavour());
};
Stream.of(ice1,ice2,ice3,ice4,ice5).sorted(creams).forEach(ref->System.out.println(ref));

System.out.println("==================");

Comparator<IceCreamDTO> dateComparator = (t1, t2) -> t2.getManfDate().compareTo(t1.getManfDate());
Stream.of(ice1, ice2, ice3, ice4, ice5).sorted(dateComparator).forEach(ref -> System.out.println(ref));

System.out.println("=================");

Comparator<IceCreamDTO> color = (t1, t2) -> t1.getColor().compareTo(t2.getColor());
Stream.of(ice1, ice2, ice3, ice4, ice5).sorted(color).forEach(ref -> System.out.println(ref));

System.out.println("=================");

Comparator<IceCreamDTO> type = (t1, t2) -> t2.getType().compareTo(t1.getType());
Stream.of(ice1, ice2, ice3, ice4, ice5).sorted(type).forEach(ref -> System.out.println(ref));

System.out.println("===================");

Comparator<IceCreamDTO> dateComparator1 = (t1, t2) -> t2.getManfDate().compareTo(t1.getManfDate());
Comparator<IceCreamDTO> priceComparator1 = (t1, t2) -> t2.getPrice().compareTo(t1.getPrice());
Stream.of(ice1, ice2, ice3, ice4, ice5).sorted(priceComparator1.thenComparing(dateComparator1)).forEach(ref->System.out.println(ref));

}
}

