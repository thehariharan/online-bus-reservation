package com.altimetrik.bus.reservation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "travel_point")
public class TravelPointEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "travel_point_id")
	private Long travelPointId;
	private String source;
	private String destination;

	public TravelPointEntity() {
	}

	public TravelPointEntity(Long travelPointId, String source, String destination) {
		this.travelPointId = travelPointId;
		this.source = source;
		this.destination = destination;
	}

	public Long getTravelPointId() {
		return travelPointId;
	}

	public void setTravelPointId(Long travelPointId) {
		this.travelPointId = travelPointId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
