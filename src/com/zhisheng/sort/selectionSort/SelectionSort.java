package com.zhisheng.sort.selectionSort;

/**
 * Created by 10412 on 2017/1/23.
 */
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        int i,j,min,temp;

        for(i = 0;i < n-1; i++)
        {
            min = i;
            for(j = i+1;j < n; j++)
                if(A[min] > A[j])
                    min = j;
            if(min != i)
            {
                temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
