package ch.fahrzeugsteuer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTaxCalculatorTest {

    int ccm = 6102;
    int expected = 1858;

    @Test
    void isLowerThan() {
        VehicleTaxCalculator vh = new VehicleTaxCalculator();
        assertEquals(expected, vh.getPriceFromCcm(ccm));
    }

    @Test
    void isBiggerThan6000() {
        int newValue = (ccm - 6000);
        double devided = Math.floor(newValue / 1000);
        if(ccm % 1000 != 0){
            devided += 1;
        }
        double  multiplier = devided * 300 + 1258;
        VehicleTaxCalculator vh = new VehicleTaxCalculator();
        assertEquals(multiplier, vh.getPriceFromCcm(ccm));
    }

}