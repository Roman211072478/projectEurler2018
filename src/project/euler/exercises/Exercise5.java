package project.euler.exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

    //List of primes, easier when testing for primes, by comparing with primes and not all the numbers,this should
    //cut time
    private List<Integer> primes = new ArrayList<>();
    //constructor
    public Exercise5() {
    }

    //only accessor
    public int getSmallestMultiplier(int numbersUnder)//start from 2 -> numberSpecified
    {
        for(int x = 2;x <= numbersUnder;x++)
        {
            checkPrime(x);//call method
        }
        //run last operation
        return useOfExponents(numbersUnder);
    }

/**get all the prime numbers from 2 to what ever number was specified*/
    private boolean checkPrime(int divisor) {
        int value;

        for(int i = 0;i < primes.size();i++) {

            value = divisor  % primes.get(i);

            if (value == 0)//means it was no remainder
            {
                return false;
            }
        }
        primes.add(divisor);
        return true;
    }

    private int useOfExponents(int numbersUnder)
    {
        Double sum = new Double(1);//used to add total
        double valueVariable = 0;
        int counter;

        for(int x = 0;x < primes.size(); x++)
        {
            counter = 0;
            valueVariable = 0;
            while(valueVariable <= numbersUnder)//used because we dont no what the limit should be
            {
                counter++;
                valueVariable = Math.pow(primes.get(x), counter);
            }

            counter = counter-1;
            sum = sum *  Math.pow(primes.get(x), counter);
            System.out.println(primes.get(x) +"^"+counter);
            }
        return sum.intValue();
    }
}
