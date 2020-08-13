package com.altimetrik.bus.reservation.controller;

import com.altimetrik.bus.reservation.entity.BusEntity;
import com.altimetrik.bus.reservation.model.request.BusSearchRequest;
import com.altimetrik.bus.reservation.model.response.BusSearchResponse;
import com.altimetrik.bus.reservation.service.BusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    BusService busService;

    /**
     * getBusDetails method retrieves corresponding bus details
     */
    @RequestMapping("/{id}")
    public BusEntity getBusDetails(@PathVariable Long id) {
        return busService.getBusDetails(id);
    }

    /**
     * getBusSearchResults method fetches sorted search results
     */
    @PostMapping(value = "/search/{sortBy}")
    public BusSearchResponse getBusSearchResults(@RequestBody BusSearchRequest busSearchRequest,
            @PathVariable String sortBy) {
        return busService.getBusSearchResults(busSearchRequest, sortBy);
    }

}