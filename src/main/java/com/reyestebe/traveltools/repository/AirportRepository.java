package com.reyestebe.traveltools.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reyestebe.traveltools.domain.Airport;


@RepositoryRestResource(collectionResourceRel = "airport", path = "airport")
public interface AirportRepository extends PagingAndSortingRepository<Airport, String> {

  

}


