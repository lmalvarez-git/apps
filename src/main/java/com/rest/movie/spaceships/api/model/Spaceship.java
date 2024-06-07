package com.rest.movie.spaceships.api.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@lombok.Generated
@Entity
@Getter
@Setter
@Builder
public class Spaceship implements Serializable {

	private static final long serialVersionUID = 3589170347243249748L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String series;
	private String movie;
}