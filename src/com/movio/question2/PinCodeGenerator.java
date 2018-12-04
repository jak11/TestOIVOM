package com.movio.question2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PinCodeGenerator {
    /**
     * Generate 1000 distinct 4 digit pincodes     *
     * @return
     */
    public static Set<String> generateRandomPincodes(int size) {
        Set<String> result = new HashSet<>();
        if(size <= 0 ) {
            return result;
        }

        String temp;
        int count = 0;
        while (count < size) {
            temp = getFourDigitRandomNumber();
            if(!result.contains(temp) && PincodeValidator.isValidPin(temp)) {
                result.add(temp);
                count++;
            }
        }
        return result;
    }

    /**
     * Get 4 digit number in range [0000 - 9999]
     * @return
     */
    private static String getFourDigitRandomNumber(){
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }
}
