package com.reyestebe.traveltools.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reyestebe.traveltools.domain.Flight;


@RepositoryRestResource(collectionResourceRel = "flight", path = "flight")
public interface FlightRepository extends PagingAndSortingRepository<Flight, Integer> {

  

}


