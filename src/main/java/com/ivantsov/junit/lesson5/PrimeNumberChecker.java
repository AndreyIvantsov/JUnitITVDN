package com.ivantsov.junit.lesson5;

public class PrimeNumberChecker {
    
    /**
     * Проверяет является ли параметр простым числом, то есть
     * может делится без остатка только на 1 и сам на себя
     * 
     * @param primeNumber - проверяемое число
     * @return true если параметр простое число, false в 
     *         в противном случае
     */
    public boolean validate(int primeNumber) {
        for (int i = 2; i < primeNumber / 2; i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
