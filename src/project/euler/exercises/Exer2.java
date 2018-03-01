package project.euler.exercises;

public class Exer2 {


    public  int  fibnacci2(int limit)
    {
        int val1=0,val2=1,val3;
        int sum = 0;

        for(int i =0;i<limit;i++)
        {
            val3 = val1 + val2;

            //switch values around now
            val1=val2;
            val2=val3;

            if(val3 > limit)
            {
                break;
            }


            if((val3 % 2) == 0)
            {
                System.out.println(val3);
                sum += val3;
            }

        }
        System.out.println("Sum: "+ sum);

        return sum;
    }
}
