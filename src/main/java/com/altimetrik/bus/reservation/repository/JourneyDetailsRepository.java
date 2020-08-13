package com.altimetrik.bus.reservation.repository;

import java.util.List;

import com.altimetrik.bus.reservation.entity.JourneyDetailsEntity;
import com.altimetrik.bus.reservation.entity.TravelPointEntity;

import org.springframework.data.repository.CrudRepository;

public interface JourneyDetailsRepository extends CrudRepository<JourneyDetailsEntity, Long> {

	public List<JourneyDetailsEntity> findByTravelPointEntity(TravelPointEntity travelPointEntity);

}
