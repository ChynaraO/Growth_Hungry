package FoundationsForDM_DS_Algorythms.W9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> primeFactors(int n){
        List<Integer> primeFactors = new ArrayList<>();
        int squareRoot = (int) Math.floor(Math.sqrt(n));
        for(int i = 2; i<=squareRoot; i++){
            if(n%i==0){
                while (n%i==0){
                    n=n/i;
                    primeFactors.add(i);
                }
            }
        }
        if(n>1){
            primeFactors.add(n);
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(34));
    }
}
