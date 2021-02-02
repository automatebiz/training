package com.training.concepts.sorting;

import com.training.concepts.Vehicle;

import java.util.Comparator;

public class VehicleMakeComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null)
            return -1;
        if (o2 == null)
            return 1;

        return o1.getMake().compareTo(o2.getMake());
    }
}
