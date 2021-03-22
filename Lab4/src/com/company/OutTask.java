package com.company;

public class OutTask implements Task {
    private String msg;

    public OutTask(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute() {
        System.out.println(msg);
    }
}
