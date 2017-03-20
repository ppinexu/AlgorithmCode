### 题目：

> 我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？



### 代码：

[RectCover.java](./RectCover.java)

```
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
```



