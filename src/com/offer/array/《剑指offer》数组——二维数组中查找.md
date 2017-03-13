**题目：**

> 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
> 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


**思路：**

> 利用二维数组由上到下，由左到右递增的规律，
> 那么选取右上角或者左下角的元素 arr[row][col] 与 target 进行比较
> 这里就选右上角元素，当 target < arr[0][col]，左移，col-- ；当 target > arr[0][col], 下移，row++。

```
public  boolean FindNumInArray(int[][] arr, int target){

    int row = 0;    //行
    int col = arr[0].length - 1;    //列

    while (row <= col && col >= 0){
        if (target == arr[row][col]){
            return true;
        }else if (target < arr[row][col]){
            col--;
        }else{
            row++;
        }
    }
    return false;
}
```

代码详情（含测试）：[FindNumInArray.java](./FindNumInArray.java)

