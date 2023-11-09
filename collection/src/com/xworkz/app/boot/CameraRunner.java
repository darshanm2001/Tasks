package com.xworkz.app.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import com.xworkz.app.dto.CameraDTO;

public class CameraRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in CameraRunner");

		CameraDTO canon = new CameraDTO(1, "Canon", "M60", 50000, LocalDate.of(2023, 5, 1));
		CameraDTO sony = new CameraDTO(2, "Sony", "M20", 80000, LocalDate.of(2023, 6, 15));
		CameraDTO nikon = new CameraDTO(3, "Nikon", "N60", 10000, LocalDate.of(2023, 12, 10));
		CameraDTO kodak = new CameraDTO(4, "Kodak", "K70", 30000, LocalDate.of(2023, 9, 1));
		CameraDTO panasonic = new CameraDTO(5, "Panasonic", "P600", 90000, LocalDate.of(2023, 5, 1));

		Collection<CameraDTO> ref = new ArrayList<>();
		ref.add(panasonic);
		ref.add(kodak);
		ref.add(nikon);
		ref.add(sony);
		ref.add(canon);

		ref.stream().filter(camera -> camera.getBrand().equals("Canon"))
				.forEach(cams -> System.out.println(cams.getBrand()));

		Collection<String> models = new ArrayList<String>();
		ref.stream().filter((cost) -> cost.getCost() > 40000).forEach(cams1 -> models.add(cams1.getModel()));
		models.forEach(cams2 -> System.out.println("models:" + cams2));

		Collection<Double> prices = new ArrayList<>();
		ref.stream().filter(cams3 -> cams3.getModel().equals("P600")).forEach(cams3 -> prices.add((double) cams3.getCost()));
		prices.forEach(cams3 -> System.out.println("cost :" + cams3));

	}
}
