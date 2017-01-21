package com.zhisheng.binarytree.two;

/**
 * Created by 10412 on 2017/1/21.
 */
public class Rotation
{
    public static boolean chkRotation(String A, int lena, String B, int lenb) {
        // write code here
        if (lena != lenb){
            return false;
        }else {
            String str = A + A;
            return str.contains(B);
        }
    }
}
