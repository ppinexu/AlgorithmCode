### 题目

> 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

### 思路

> 首先我们考虑最简单的情况。如果只有1个台阶，那么显然只有一种跳法；如果是2级台阶，那么有2种跳法。
> 对于一个有n级台阶的楼梯来说，我们设跳法为 f(n) ，假如我们先跳1个台阶，则剩下有 n-1 个台阶，跳法为 f(n-1) 次，
> 假如我们先跳2个台阶，则剩下 n-2 阶，跳法为 f(n-2)；

由此可以推出，对于一个n阶的楼梯，有以下这个跳台阶的公式：

![](http://img.my.csdn.net/uploads/201210/04/1349345148_9247.PNG)

这样递归的公式就出来的，马上就可以用递归的方法来解决。但是递归的方式占用栈的空间是按照递归深度的级数递增的，所以递归只能求级数比较少的情况。


### 代码

```
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
```

### 扩展

当跳台阶的选择多了呢？比如说 每次可以跳3个台阶；按照同样的方法分析，如下公式：

![](http://img.my.csdn.net/uploads/201210/04/1349345515_6689.PNG)

### 代码

```
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
```

### 变态跳台阶

延伸(变态跳台阶)：可以跳 n 级？

### 代码

```
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
```

**代码地址：** [JumpFloor.java](./JumpFloor.java)