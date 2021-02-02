package com.training.concepts;

import com.training.assignment.model.Employee;
import com.training.assignment.repository.EmployeeRepository;
import com.training.concepts.sorting.VehicleMakeComparator;
import com.training.concepts.sorting.VehicleModelComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Console {

    public static void main(String[] args) {
        FuelType.PETROL.printSomething();
        FuelType.DIESEL.printSomething();
        FuelType.CNG.printSomething();
        FuelType.EV.printSomething();
        FuelType.HYBRID.printSomething();

        final List<Vehicle> vehicles = randomVehicles();
        for (Object v : vehicles) {
            Vehicle vehicle = (Vehicle) v;
            if (vehicle.getFuelType().equals(FuelType.PETROL))
                System.out.println(vehicle);
        }


    }

    private static void sorting() {
        final List<Vehicle> vehicles = randomVehicles();

        Collections.sort(vehicles);
        vehicles.forEach(System.out::println);

        System.out.println("--------------------------------");

        // Sort by Vehicle make
        Collections.sort(vehicles, new VehicleMakeComparator());
        vehicles.forEach(System.out::println);

        System.out.println("--------------------------------");

        // Sort by Vehicle make
        Collections.sort(vehicles, new VehicleModelComparator());
        vehicles.forEach(System.out::println);

        System.out.println("--------------------------------");

        // Fuel Type
        Collections.sort(vehicles, (o1, o2) -> {
            if (o1 == null && o2 == null)
                return 0;
            if (o1 == null)
                return -1;
            if (o2 == null)
                return 1;

            return o1.getFuelType().compareTo(o2.getFuelType());
        });
        vehicles.forEach(System.out::println);

        System.out.println("--------------------------------");

        // Color
        Collections.sort(vehicles, (o1, o2) -> o1.getColor().compareTo(o2.getColor()));

        vehicles.forEach(v -> {
                    v.setColor(v.getColor().toUpperCase());
                    System.out.println(v);
                }
        );
    }

    private static List<Vehicle> randomVehicles() {
        // Create few vehicles
        Vehicle creta = new Vehicle("Hyundai", "Creta", FuelType.PETROL,
                "White", "TS09 1231", "VIN1", 1000);

        Vehicle swift = new Vehicle("Maruti", "Swift", FuelType.DIESEL,
                "Blue", "TS09 2345", "VIN2", 5000);

        Vehicle city = new Vehicle("Toyota", "Camry", FuelType.EV,
                "Blue", "TS09 2345", "VIN3", 500);

        // Add those to a collection
        return Arrays.asList(creta, swift, city);
    }
}
