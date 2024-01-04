package com.xworkz.springMagnet.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MagnetDTO {
	@Min(10)
	@Max(100)
	private int strength;
	@NotNull(message = "Color field should not be empty")
	@Size(min = 3, max = 30, message = "Color must be between 3-30 characters")
	private String color;
	@NotNull
	@Size(min = 3, max = 30, message = "Shape must be between 3-30 characters")
	private String shape;
	@NotNull
	@Size(min = 3, max = 30, message = "Material must be between 3-30 characters")
	private String material;
	@DecimalMin("1.00")
	@DecimalMax("100.00")
	private double weight;
}
