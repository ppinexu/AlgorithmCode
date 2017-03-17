package com.offer.stack;

import java.util.Stack;

/**
 * Created by 10412 on 2017/3/17.
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class CreateQueue
{
    Stack<Integer> stackPush = new Stack<Integer>();
    Stack<Integer> stackPop = new Stack<Integer>();



    public void push(int node) {
        stackPush.push(node);
    }

    public int pop() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()){   //stackPop中一开始不能够有数据
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());     //将stackPush中的数据push到stackPop中
            }
        }
        return stackPop.pop();
    }
}
