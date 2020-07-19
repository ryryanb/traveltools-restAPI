package com.reyestebe.traveltools.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Flight {
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "airportMnemonic")
	private Airport originAirport;
	@ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "airportMnemonic")
	private Airport destinationAirport;
	private String longName;
	private String city;
	private String country;
	private double latitude;
	private double longitude;
	private Double price;
	private String destination;
	
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
