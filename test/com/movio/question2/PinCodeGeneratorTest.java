package com.movio.question2;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PinCodeGeneratorTest {
    @Test
    public void generateRandomPincodes_HappyCase() {
        Set<String> pincodes = PinCodeGenerator.generateRandomPincodes(1000);
        System.out.println("Generated pin codes : " + pincodes);
        for (String pin: pincodes ) {
            // Checking each pin generated is valid or not
            Assertions.assertTrue(PincodeValidator.isValidPin(pin));
        }
        Assertions.assertEquals(1000, pincodes.size());
    }

    @Test
    public void generateRandomPincodes_TestRandomBehavior() {
        Set<String> pincodes1 = PinCodeGenerator.generateRandomPincodes(1000);
        Set<String> pincodes2 = PinCodeGenerator.generateRandomPincodes(1000);
        System.out.println("Generated pin codes 1st batch: " + pincodes1);
        System.out.println("Generated pin codes 2nd batch: " + pincodes2);
        Assertions.assertFalse(pincodes1.containsAll(pincodes2));
    }
}