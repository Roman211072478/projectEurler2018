package project.euler.exercises;

public class Exercise4 {

    public Exercise4() {
    }

    public int value()
    {
        int sum = 0,maxValue =0,prevValue=0;
        for(int i=100;i<1000;i++)
        {
            for(int x=10;x<i;x++)
            {
                sum = i * x;

                maxValue = reverseNumber(sum);

                if(maxValue == -1)
                {//false not palindrome

                }
                else{//true
                    //do a max logic
                    if(maxValue > prevValue)
                    {
                        prevValue = maxValue;
                    }

                continue;
                }
            }
        }

        if(maxValue > prevValue)
        {

        }
        System.out.println(prevValue);
        return 0;
    }

    private int reverseNumber(int value)
    {
        int originalValue = value;
        int reversed = 0;

        while(value != 0) {
            int digit = value % 10;
            reversed = reversed * 10 + digit;
            value /= 10;
        }

        if(originalValue == reversed)
        {
            return reversed;
        }
        else{
            return -1;
        }
    }
}
