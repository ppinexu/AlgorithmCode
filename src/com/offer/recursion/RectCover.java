package com.offer.recursion;

/**
 * Created by 10412 on 2017/3/20.
 */
public class RectCover
{
    public int RectCover(int target) {
        if (target <= 0) {
            return 0;
        } else if (target == 1 || target == 2) {
            return target;
        } else {
            int a = 1, b = 2, c = 0;
            for (int i = 3; i <= target; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
