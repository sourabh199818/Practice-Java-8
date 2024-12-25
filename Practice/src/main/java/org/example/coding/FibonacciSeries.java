package org.example.coding;


public class FibonacciSeries {

    public  static void fibonacciS()
    {

        int a = 1 ;
        int b = 0;
        int current = a;

        System.out.print(b+", ");

        for(int i= 0; i<=10; i++)
        {


//            increment the value as per earlier value
//             current become 1
               current = a+b;
               a = b;
               b= current;
            System.out.print(current+", ");  //initial value to be printed




        }

    }
}

