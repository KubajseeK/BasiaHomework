package com.basia;

import java.util.Random;

public class Encrypt {
    /*
     * @param n length of the password
     * @param rules if true, then 6<length<31, minvar least one digit, upper, lower letter
     * @description
     */
    public String getRandomPassword(int n,boolean rules) {
        if (rules == true && n < 6 || n > 30)
            n = 10;
        Random rnd = new Random();
        String password = "";
        int countOfLetters = 0;
        int upper = 0;
        int lower = 0;
        int numbers = 0;
        int number = 0;
        if (rules == false) {
            numbers = upper = lower = 1;
        }

        do {
            int type = rnd.nextInt(3);
            switch (type) {
                case 0: number = rnd.nextInt(10) + 48; numbers++; break;
                case 1: number = rnd.nextInt(26) + 65; upper++; break;
                case 2: number = rnd.nextInt(26) + 97; lower++; break;
            }
            char c = (char) number;
            password += c;
            countOfLetters++;
            if (countOfLetters == n && (numbers == 0 || upper == 0 || lower == 0)) {
                countOfLetters = 0;
                upper = 0;
                lower = 0;
                numbers = 0;
                password = "";
            }


        } while (countOfLetters < n);

        return password;
    }
}
