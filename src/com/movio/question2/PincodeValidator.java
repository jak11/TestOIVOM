package com.movio.question2;

public class PincodeValidator {
    /**
     * Check if given Pin Code is valid
     * PIN should be:
        1. Two consecutive digits should not be the same (e.g. 1156 is invalid)
        2. Three consecutive digits should not be incremental (e.g. 1236 is invalid)
     * @param pin
     * @return
     */
    public static boolean isValidPin(String pin) {
        char[] chars = pin.toCharArray();
        return !(ifThreeDigitsAreIncremental(chars) || ifTwoDigitsAreConsecutive(chars));
    }
    private static boolean ifThreeDigitsAreIncremental(char[] chars) {
        char pre = chars[0];
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if(Character.valueOf(chars[i]) - Character.valueOf(pre) == 1) {
                count++;
                if(count == 2){
                    return true;
                }
            } else {
                count = 0;
            }
            pre = chars[i];
        }
        return false;
    }

    private static boolean ifTwoDigitsAreConsecutive(char[] chars) {
        char pre = chars[0];
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if(Character.valueOf(chars[i]) == Character.valueOf(pre)) {
                    return true;
            }
            pre = chars[i];
        }
        return false;
    }
}
