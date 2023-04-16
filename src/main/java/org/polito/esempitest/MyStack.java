package org.polito.esempitest;

public class MyStack {
    private int[] stack = new int[10];
    private int next;
    public void push(int i){
        stack[next++] = i;

    }

    public int pop() {
        return stack[--next];
    }
}
