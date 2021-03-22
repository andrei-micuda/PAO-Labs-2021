package com.company;

public class Container {
    private Task[] tasks;
    private int maxSize;
    private int currentSize = 0;

    public Container() {
        this.tasks = new Task[10];
        this.maxSize = 10;
    }

    public Container(int size) {
        this.tasks = new Task[size];
        this.maxSize = size;
    }

    void add(Task t) {
        if (currentSize == maxSize) {
            System.out.println("Maximum capacity reached!");
            return;
        }

        tasks[currentSize++] = t;
    }

    void add(Task ...ts) {
        for(var t : ts) {
            add(t);
        }
    }

    void pop() {
        currentSize--;
    }

    void runTasks() {
        for (int i = 0; i < currentSize; i++) {
            tasks[i].execute();
        }
    }
}
