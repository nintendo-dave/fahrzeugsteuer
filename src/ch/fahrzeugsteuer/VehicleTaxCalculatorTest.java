package ch.fahrzeugsteuer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTaxCalculatorTest {

    @Test
    void is6000() {
        VehicleTaxCalculator vh = new VehicleTaxCalculator();
        assertEquals(1258, vh.getPriceFromCcm(6000));
    }

}