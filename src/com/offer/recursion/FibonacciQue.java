package com.offer.recursion;

/**
 * Created by 10412 on 2017/3/12.
 */

/*
    大家都知道斐波那契数列(0、1、1、2、3、5、8、13、21、……)，
    现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 */

public class FibonacciQue
{
    public static int Fibonacci(int n){
        int a=1,b=1,c=0;
        //对n进行判断
        if (n <= 0){
            return 0;
        }else if ( n == 1 || n == 2){
            return 1;
        }else {
            for (int i = 3; i <= n; i++){
                //迭代
                c = a + b;
                a = b;
                b = c;
            }
            return c;  //返回斐波那契数列的第n项
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(39));
    }
}
