package com.company;

public class CandyBag {
    private CandyBox[] boxes;
    private int usedCapacity;
    private int totalCapacity;

    public CandyBag() {
        this.boxes = new CandyBox[10];
        this.totalCapacity = 10;
    }

    public CandyBag(int capacity) {
        this.boxes = new CandyBox[capacity];
        this.totalCapacity = capacity;
    }

    public void addBox(CandyBox box) {
        if(usedCapacity == totalCapacity) {
            System.out.println("Capacity reached!");
            return;
        }
        this.boxes[usedCapacity++] = box;
    }

    public CandyBox[] getBoxes() {
        return boxes;
    }

    public void setBoxes(CandyBox[] boxes) {
        this.boxes = boxes;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
}
