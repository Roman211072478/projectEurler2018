package project.euler.exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public Exercise1() {
        List<Integer> numbers = new ArrayList();
        int sum = 0;

        for(int i =0;i<1000;i++)
        {

            if(checkMultiples(i))
            {
                numbers.add(i);
                sum+=i;
            }
        }
        System.out.println(numbers);
        System.out.println(sum);

    }

    public boolean checkMultiples(int value)
    {

        if((value % 3) == 0 || (value % 5) == 0)
        {
            return true;
        }

        return false;
    }
}
