**题目：**

>请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为 We Are Happy.则经过替换之后的字符串为 We%20Are%20Happy。


**思路：**

这种替换问题要考虑是否会覆盖原字符串，若是在源字符串上直接替换。

看到这个问题我觉得很多人都会想到直接从头开始替换，即遇到空格就将其替换为%20，每次都要将空格后的字符后移两个字节。这种解法的时间复杂度为O(n^2)！！！

另外一种较好的解法是从后往前替换，具体做法是从头遍历计算所有空格数，计算出总的长度。 该解法的前提条件是若在源字符串上替换就要求源字符串有足够的空间来容纳新的字符串。时间复杂度为O(n)！！！



***

```
public  String replaceSpace(StringBuffer str) {
        //toCharArray()函数会返回一个新的数组，
        //因此就算原数组定义了长度，返回的新数组会取代它
        char[] ch = str.toString().toCharArray();

        int spacenum = 0;  //空格数量
        for(int i =0; i<ch.length; i++){
            if(ch[i]==' '){
                spacenum++; //如果是空格，加1
            }
        }
        char[] ch1 = new char[2*spacenum + str.length()];
        int len = 2*spacenum+str.length()-1;

        for(int i=ch.length-1; i>=0; i--){
            if(ch[i] != ' '){
                ch1[len--] = ch[i];
            }else{
                ch1[len--] = '0';
                ch1[len--] = '2';
                ch1[len--] = '%';
            }
        }
        return String.valueOf(ch1);
    }
```

还有一种方法虽然很简单（调用 Java API中的 replaceAll 方法·），但是估计面试官不是想这样考你的。

```
public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
        //\s表示空格（正则表达式）string.toString();
```


所有代码（算法+测试）详见： [ReplaceBlankSpace.java](./ReplaceBlankSpace.java)
