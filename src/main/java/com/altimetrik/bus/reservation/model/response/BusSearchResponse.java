package com.altimetrik.bus.reservation.model.response;

import java.io.Serializable;
import java.util.List;

import com.altimetrik.bus.reservation.entity.JourneyDetailsEntity;

public class BusSearchResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<JourneyDetailsEntity> journeyDetailsList;
	private String sortBy;
	private int searchResultSize;

	public BusSearchResponse() {
	}

	public BusSearchResponse(List<JourneyDetailsEntity> journeyDetailsList, String sortBy, int searchResultSize) {
		super();
		this.journeyDetailsList = journeyDetailsList;
		this.sortBy = sortBy;
		this.searchResultSize = searchResultSize;
	}

	public List<JourneyDetailsEntity> getJourneyDetailsList() {
		return journeyDetailsList;
	}

	public void setJourneyDetailsList(List<JourneyDetailsEntity> journeyDetailsList) {
		this.journeyDetailsList = journeyDetailsList;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public int getSearchResultSize() {
		return searchResultSize;
	}

	public void setSearchResultSize(int searchResultSize) {
		this.searchResultSize = searchResultSize;
	}

}
