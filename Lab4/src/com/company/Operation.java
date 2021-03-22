package com.company;

public class Operation implements Plus<Operation>, Minus<Operation>, Mult<Operation>, Div<Operation> {
    private float data;

    public Operation(float data) {
        this.data = data;
    }

    @Override
    public Operation div(float n) {
        this.data /= n;
        return this;
    }

    @Override
    public Operation minus(float n) {
        this.data -= n;
        return this;
    }

    @Override
    public Operation mult(float n) {
        this.data *=n;
        return this;
    }

    @Override
    public Operation plus(float n) {
        this.data += n;
        return this;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "data=" + data +
                '}';
    }
}
