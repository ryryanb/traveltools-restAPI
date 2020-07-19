package com.reyestebe.traveltools.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reyestebe.traveltools.domain.Attraction;


@RepositoryRestResource(collectionResourceRel = "attraction", path = "attraction")
public interface AttractionRepository extends PagingAndSortingRepository<Attraction, Integer> {

  

}


