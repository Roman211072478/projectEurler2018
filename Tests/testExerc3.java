import org.junit.jupiter.api.Test;
import project.euler.exercises.Exercise3;

import java.math.BigInteger;

public class testExerc3 {

    private static BigInteger big1 = new BigInteger("600851475143");
    @Test
    void testPrimeFactors() {

        Exercise3 ex = new Exercise3();

        ex.getLargestPrime(big1);

    }
}
