package com.altimetrik.bus.reservation.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "journey_details")
public class JourneyDetailsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "travel_point_id", referencedColumnName = "travel_point_id")
	private TravelPointEntity travelPointEntity;
	@ManyToOne
	@JoinColumn(name = "bus_id", referencedColumnName = "bus_id")
	private BusEntity busEntity;
	private LocalDate travelDate;
	private LocalTime depTime;
	private LocalTime arrTime;
	private float duration;
	private int price;

	public JourneyDetailsEntity() {
	}

	public JourneyDetailsEntity(long travelPointId, long busId, LocalDate travelDate, LocalTime depTime,
			LocalTime arrTime, int duration, int price) {
		this.travelPointEntity = new TravelPointEntity(travelPointId, "", "");
		this.busEntity = new BusEntity(busId, "", "");
		this.travelDate = travelDate;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.duration = duration;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TravelPointEntity getTravelPointEntity() {
		return travelPointEntity;
	}

	public void setTravelPointEntity(TravelPointEntity travelPointEntity) {
		this.travelPointEntity = travelPointEntity;
	}

	public BusEntity getBusEntity() {
		return busEntity;
	}

	public void setBusEntity(BusEntity busEntity) {
		this.busEntity = busEntity;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public LocalTime getDepTime() {
		return depTime;
	}

	public void setDepTime(LocalTime depTime) {
		this.depTime = depTime;
	}

	public LocalTime getArrTime() {
		return arrTime;
	}

	public void setArrTime(LocalTime arrTime) {
		this.arrTime = arrTime;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
