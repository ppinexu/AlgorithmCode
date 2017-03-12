package com.offer.string;


import java.lang.*;

/**
 * Created by 10412 on 2017/3/12.
 */

/*
请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class ReplaceBlankSpace
{
    public static String replaceSpace(StringBuffer str) {
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

    /*public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");//\s表示空格（正则表达式）string.toString();
    }*/

    public static void main(String[] args) {
        String str = "We Are Happy.";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(replaceSpace(stringBuffer));
    }































}

