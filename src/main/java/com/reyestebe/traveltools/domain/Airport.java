package com.reyestebe.traveltools.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Airport {
	
	@NotNull
	@Id
	private String airportMnemonic;

	private String airportStatus;

	private double latitude;

	private double longitude;

	private float averageFlight;

	public double nearestCitiesTotalScore = 0D;
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
