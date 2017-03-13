package com.offer.recursion;

/**
 * Created by 10412 on 2017/3/13.
 */
public class FindNum
{
    public static int fun(int n){
        int num = 0;
        int i, j;
        for (i = 5;i <= n;i += 5)
        {
            j = i;
            while (j % 5 == 0)
            {
                num++;
                j /= 5;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(fun(10000));   //2499
    }
}
