package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Police {
    public boolean checkDriver(Driver driver) {
        int adultAgeThreshold = 18;
        if(driver.getAge() >= adultAgeThreshold) return true;
        else return false;
    }


    @Test
    void should_park_a_car_to_a_parking_lot_and_get_it_back() {

        assertTrue(new Police().checkDriver(new Driver(18)));
        assertFalse(new Police().checkDriver(new Driver(17)));
    }
}
