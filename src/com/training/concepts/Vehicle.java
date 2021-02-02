package com.training.concepts;

public class Vehicle extends Object implements Comparable<Vehicle> {
    private String make;
    private String model;
    private FuelType fuelType;
    private String color;
    private String registrationNumber;
    private String vin;
    private int noOfKM;
    private Insurance insurance;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Vehicle(String make, String model, FuelType fuelType,
                   String color, String registrationNumber, String vin,
                   int noOfKM) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.vin = vin;
        this.noOfKM = noOfKM;
    }

    public Vehicle() {
    }

    public int getNoOfKM() {
        return noOfKM;
    }

    public void setNoOfKM(int noOfKM) {
        this.noOfKM = noOfKM;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Vehicle))
            return false;

        Vehicle incomingVehicle = (Vehicle) o;
        if (this.getVin().equals(incomingVehicle.getVin()))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = make != null ? make.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getMake() + ", " + this.getModel() + ", "
                + this.getColor() + ", " + this.getFuelType() + ", " + this.getNoOfKM();
    }

    @Override
    public int compareTo(Vehicle o) {
        if (o == null)
            return 1;

        if (this.noOfKM > o.noOfKM)
            return 1;

        if (this.noOfKM < o.noOfKM)
            return -1;

        return 0;
    }
}
