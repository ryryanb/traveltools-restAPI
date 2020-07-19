package com.reyestebe.traveltools.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Attraction {
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String city;
	private String name;
	private String longName;
	private String country;
	private Double numReviews;
	private Double rating;
	private Double latitude;
	private Double distance;
	private Double price;
	private Double latLongError;
	private Double longitude;
	private String destinationCode;
	private String attractionCode;
	private String pageLink;
	
	@Column(insertable = true, updatable = false)
	private LocalDateTime entryCreated;
	private LocalDateTime entryModified;

	@PrePersist
	void onCreate() {
		this.setEntryCreated(LocalDateTime.now());
		this.setEntryModified(LocalDateTime.now());
	}
	@PreUpdate
	void onUpdate() {
		this.setEntryModified(LocalDateTime.now());
	}

}
