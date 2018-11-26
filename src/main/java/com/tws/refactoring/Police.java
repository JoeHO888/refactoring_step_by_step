package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Police {
    private final int adultAgeThreshold = 18;

    public boolean isDriverAdult(Driver driver) {

        return (driver.getAge() >= adultAgeThreshold);
    }


    @Test
    void should_park_a_car_to_a_parking_lot_and_get_it_back() {

        assertTrue(new Police().isDriverAdult(new Driver(18)));
        assertFalse(new Police().isDriverAdult(new Driver(17)));
    }
}
