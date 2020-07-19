package com.reyestebe.traveltools.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reyestebe.traveltools.domain.Hotel;


@RepositoryRestResource(collectionResourceRel = "hotel", path = "hotel")
public interface HotelRepository extends PagingAndSortingRepository<Hotel, Integer> {

  

}


