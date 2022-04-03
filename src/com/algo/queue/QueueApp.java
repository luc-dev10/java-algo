package com.algo.queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();
        for (int i = 1; i < 11; i++)
            integerQueue.push(i);

        System.out.println(integerQueue.toString());

        // pop
        System.out.printf("Popped: %d\n", integerQueue.pop());

    }
}
