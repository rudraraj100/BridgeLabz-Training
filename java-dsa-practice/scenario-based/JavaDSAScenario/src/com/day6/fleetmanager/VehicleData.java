package com.day6.fleetmanager;

public class VehicleData {
	
	private String vehicleId;
	private double mileage;
	
	public VehicleData(String vehicleId, double mileage) {
	
		this.vehicleId = vehicleId;
		this.mileage = mileage;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public double getMileage() {
		return mileage;
	}
	
	public String toString() {
		return vehicleId +  "|" + mileage;
	}
	
	
}
