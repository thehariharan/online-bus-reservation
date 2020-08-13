package com.altimetrik.bus.reservation.repository;

import com.altimetrik.bus.reservation.entity.BusEntity;

import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<BusEntity, Long> {

}