package com.coskunyalcinkaya.basic;

public class Factorial {

    public int factorialIterative(int number){

        if (number == 0) return 1;

        int factorial = 1;

        for (int i = 1; i <= number; i++){
            factorial *= i;
        }

        return factorial;
    }

    public int factorialRecursive(int number){

        if (number == 0) return 1;

        return number * factorialRecursive(number - 1);
    }
}
