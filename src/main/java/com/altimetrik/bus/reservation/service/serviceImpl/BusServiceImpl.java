package com.altimetrik.bus.reservation.service.serviceImpl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.altimetrik.bus.reservation.entity.BusEntity;
import com.altimetrik.bus.reservation.entity.JourneyDetailsEntity;
import com.altimetrik.bus.reservation.entity.TravelPointEntity;
import com.altimetrik.bus.reservation.model.request.BusSearchRequest;
import com.altimetrik.bus.reservation.model.response.BusSearchResponse;
import com.altimetrik.bus.reservation.repository.BusRepository;
import com.altimetrik.bus.reservation.repository.JourneyDetailsRepository;
import com.altimetrik.bus.reservation.repository.TravelPointRepository;
import com.altimetrik.bus.reservation.service.BusService;
import com.altimetrik.bus.reservation.utils.SortByEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {

        @Autowired
        private BusRepository busRepository;

        @Autowired
        private TravelPointRepository travelPointRepository;

        @Autowired
        private JourneyDetailsRepository journeyDetailsRepository;

        public BusEntity getBusDetails(Long id) {
                Optional<BusEntity> busEntity = busRepository.findById(id);
                return busEntity.orElseGet(BusEntity::new);
        }

        @Override
        public BusSearchResponse getBusSearchResults(BusSearchRequest busSearchCriteria, String sortBy) {
                TravelPointEntity travelPointEntity = travelPointRepository.findBySourceAndDestination(
                                busSearchCriteria.getSource(), busSearchCriteria.getDestination());
                List<JourneyDetailsEntity> journeyDetailsList = journeyDetailsRepository
                                .findByTravelPointEntity(travelPointEntity);
                journeyDetailsList = journeyDetailsList.stream()
                                .filter(o -> o.getTravelDate().equals(busSearchCriteria.getTravelDate()))
                                .sorted(Comparator.comparingInt(JourneyDetailsEntity::getPrice))
                                .collect(Collectors.toList());
                SortByEnum sortByValue = SortByEnum.valueOf(sortBy);
                switch (sortByValue) {
                        case OPERATORNAME:
                                journeyDetailsList = journeyDetailsList.stream()
                                                .sorted((o1, o2) -> o1.getBusEntity().getOperatorName()
                                                                .compareTo(o2.getBusEntity().getOperatorName()))
                                                .collect(Collectors.toList());
                                return new BusSearchResponse(journeyDetailsList, SortByEnum.OPERATORNAME.getType(),
                                                journeyDetailsList.size());
                        case DEPTIME:
                                journeyDetailsList = journeyDetailsList.stream()
                                                .sorted((o1, o2) -> o1.getDepTime().compareTo(o2.getDepTime()))
                                                .collect(Collectors.toList());
                                return new BusSearchResponse(journeyDetailsList, SortByEnum.DEPTIME.getType(),
                                                journeyDetailsList.size());
                        case ARRTIME:
                                journeyDetailsList = journeyDetailsList.stream()
                                                .sorted((o1, o2) -> o1.getArrTime().compareTo(o2.getArrTime()))
                                                .collect(Collectors.toList());
                                return new BusSearchResponse(journeyDetailsList, SortByEnum.ARRTIME.getType(),
                                                journeyDetailsList.size());
                        case DURATION:
                                journeyDetailsList = journeyDetailsList.stream()
                                                .sorted(Comparator.comparingDouble(JourneyDetailsEntity::getDuration))
                                                .collect(Collectors.toList());
                                return new BusSearchResponse(journeyDetailsList, SortByEnum.DURATION.getType(),
                                                journeyDetailsList.size());
                        default:
                                journeyDetailsList = journeyDetailsList.stream()
                                                .sorted(Comparator.comparingInt(JourneyDetailsEntity::getPrice))
                                                .collect(Collectors.toList());
                                return new BusSearchResponse(journeyDetailsList, SortByEnum.PRICE.getType(),
                                                journeyDetailsList.size());

                }
        }

}