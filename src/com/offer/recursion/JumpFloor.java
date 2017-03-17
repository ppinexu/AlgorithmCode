package com.offer.recursion;

/**
 * Created by 10412 on 2017/3/17.
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 延伸(变态跳台阶)：可以跳 n 级？
 */
public class JumpFloor
{
    //2
    public int JumpFloor(int target) {
        if (target <= 0 ){
            return -1;
        } else if (target == 1){
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }


    //3
    public int JumpFloor1(int target) {
        if (target <= 0 ){
            return -1;
        } else if (target == 1){
            return 1;
        } else if (target == 2) {
            return 2;
        } else if (target == 3){
            return 4;
        } else {
            return JumpFloor1(target - 1) + JumpFloor1(target - 2) + JumpFloor1(target -3);
        }
    }

    //n
    public int JumpFloor2(int target) {
        int m = 0, i;   //跳法总数
        if (target < 0) {
            m = 0;
        } else if (target == 0) {
            m = 1;
        } else {
            for (i = target - 1; i >= 0; i--) {
                m += JumpFloor2(i);
            }
        }
        return m;
    }

}
