package com.training.concepts;

/**
 * Collection of instances of homogeneous type.
 */
public enum FuelType {
    PETROL("petrol", 20),
    DIESEL(10),
    HYBRID("hybrid"),
    EV("ev", 50),
    CNG;

    private String value;
    private int noOfYearsAllowedOnRoads;

    FuelType(String value) {
        this.value = value;
    }

    FuelType(String value, int noOfYearsAllowedOnRoads) {
        this.value = value;
        this.noOfYearsAllowedOnRoads = noOfYearsAllowedOnRoads;
    }

    FuelType(int noOfYearsAllowedOnRoads) {
        this.noOfYearsAllowedOnRoads = noOfYearsAllowedOnRoads;
    }

    FuelType() {

    }

    public int getNoOfYearsAllowedOnRoads() {
        return noOfYearsAllowedOnRoads;
    }

    public String getValue() {
        return value;
    }

    public void printSomething() {
        System.out.println(this + ", " + this.getValue() + "," + this.getNoOfYearsAllowedOnRoads());
    }

}
