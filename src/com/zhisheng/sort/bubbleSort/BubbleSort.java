package com.zhisheng.sort.bubbleSort;

/**
 * Created by 10412 on 2017/1/23.
 */
public class BubbleSort
{
    public int[] bubbleSort(int[] A, int n) {
        // write code here
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i -1; j++){
                if(A[j] > A[j+1]){
                    int tem = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tem;
                }
            }
        }
        return A;
    }
}


