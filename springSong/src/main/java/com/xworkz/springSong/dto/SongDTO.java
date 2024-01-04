package com.xworkz.springSong.dto;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SongDTO {
	@NotNull
	@Size(min = 3, max = 30, message = "Name Must e between 3-30 character")
	private String name;

	@NotNull
	@Size(min = 3, max = 30, message = "Singer Must e between 3-30 character")
	private String singer;

	@NotNull
	@Size(min = 3, max = 30, message = "Composer Must e between 3-30 character")
	private String composer;

	@DecimalMin("0.30")
	@DecimalMax("10.00")
	private double duration;

	@NotNull
	@Size(min = 3, max = 30, message = "Alubm Must e between 3-30 character")
	private String album;

	@NotNull(message = "Language Should not null")
	private String language;

	@NotNull
	@Size(min = 3, max = 30, message = "lyricist Must e between 3-30 character")
	private String realseDate;

	@NotNull
	@Size(min = 3, max = 30, message = "lyricist Must e between 3-30 character")
	private String lyricist;

	@NotNull
	@Size(min = 3, max = 30, message = "director Must e between 3-30 character")
	private String director;

}
