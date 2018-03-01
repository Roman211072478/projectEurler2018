package project.euler.exercises;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Project Euler 2018  exercise 3
 * Find the highest prime factor of 600851475143
 * */
public class Exercise3 {

    private List<BigInteger> primes = new ArrayList<>();

    //constructor
    public Exercise3() {
    }

    //Main method //use method and pass a number you would want to find the prime factors of
    public BigInteger getLargestPrime(BigInteger number)
    {
        BigInteger original = number;
        BigInteger counter = BigInteger.valueOf(2);
        BigInteger newValue;

        while(counter.compareTo(original) != 0)
        {
            newValue = division(number,counter);

            if(newValue.longValue() > 0)
            {
                number = newValue;
                System.out.println("Newvalue: "+number);
            }
            else{
                counter = counter.add(BigInteger.ONE);
            }
            if(newValue.longValue() == 1)
            {
                System.out.println("done");
                return null;
            }
        }
        return null;
    }

    private BigInteger division(BigInteger value,BigInteger divisor)
    {
        if(checkPrime(divisor) == false)
        {
            return BigInteger.ZERO;
        }

        BigInteger[] outcome = value.divideAndRemainder(divisor);

        if(outcome[1] == BigInteger.ZERO)//means it has no remainder
        {
            System.out.println(outcome[0]+" : divide by : "+divisor);

            return factorAgain(outcome[0],divisor);
        }
        return BigInteger.ZERO;
    }

//    check if the divisor is a prime number if so add it to the prime List
    private boolean checkPrime(BigInteger divisor) {

        BigInteger[] outcome ;

        for(int i=0;i<primes.size();i++) {

            outcome = divisor.divideAndRemainder(primes.get(i));

            if (outcome[1] == BigInteger.ZERO)//means it was no remainder
            {//even
                return false;
            }
        }
        primes.add(divisor);
        return true;
    }

//if a prime was found see if we can use that prime to divide into the new value again..E.g factors of 8 = 2,2,2
    private BigInteger factorAgain(BigInteger value,BigInteger divisor)
    {
        boolean noRemainder = true;
        BigInteger[] outcome;

        while(noRemainder) {
            outcome = value.divideAndRemainder(divisor);
            if(outcome[1]== BigInteger.ZERO)
            {//no remainder
                value = outcome[0];
                System.out.println(outcome[0]+" : divide by : "+divisor);
            }
            else{
                noRemainder = false;
                return value;
            }
        }
        return BigInteger.ZERO;
    }
}
