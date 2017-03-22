package com.offer.bitwiseOperation;

/**
 * Created by 10412 on 2017/3/21.
 * 求二进制数中1的个数
 */
public class FindNumber
{
    //思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
    //最优解
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
