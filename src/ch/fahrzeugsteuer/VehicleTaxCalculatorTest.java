package ch.fahrzeugsteuer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTaxCalculatorTest {

    int ccm = 8000;
    int expected = 1858;

    @Test
    void isvalue() {
        VehicleTaxCalculator vh = new VehicleTaxCalculator();
        assertEquals(expected, vh.getPriceFromCcm(ccm));
    }

}