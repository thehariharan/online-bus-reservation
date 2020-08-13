package com.altimetrik.bus.reservation.service;

import com.altimetrik.bus.reservation.entity.BusEntity;
import com.altimetrik.bus.reservation.model.request.BusSearchRequest;
import com.altimetrik.bus.reservation.model.response.BusSearchResponse;

public interface BusService {

    public BusEntity getBusDetails(Long id);

    public BusSearchResponse getBusSearchResults(BusSearchRequest busSearchCriteria, String sortBy);

}