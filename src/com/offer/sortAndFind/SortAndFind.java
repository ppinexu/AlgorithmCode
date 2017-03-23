package com.offer.sortAndFind;

/**
 * Created by 10412 on 2017/3/22.
 * 打印旋转数组中的最小数字
 */
public class SortAndFind
{
    public static int minNumberInRotateArray(int [] array) {
        int low = 0 ;
        int high = array.length - 1;

        if (array.length == 0) {
            return 0;
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(minNumberInRotateArray(arr));
    }
}
