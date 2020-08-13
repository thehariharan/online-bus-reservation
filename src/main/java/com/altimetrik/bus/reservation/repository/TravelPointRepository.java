package com.altimetrik.bus.reservation.repository;

import org.springframework.data.repository.CrudRepository;

import com.altimetrik.bus.reservation.entity.TravelPointEntity;

public interface TravelPointRepository extends CrudRepository<TravelPointEntity, Long> {

	public TravelPointEntity findBySourceAndDestination(String source, String destination);

}
