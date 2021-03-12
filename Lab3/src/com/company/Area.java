package com.company;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area() {
        this.candyBag = new CandyBag(3);
        this.candyBag.addBox(new Milka("dark", "French", 1, 4));
        this.candyBag.addBox(new Milka("dark", "French", 2, 1));
        this.candyBag.addBox(new Lindt("milk", "German", 2));

        this.number = 10;
        this.street = "Avenue des Champs-Élysées";
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void printAddress() {
        System.out.println("Address: " + this.street + ", " + this.number);
        var boxes = this.candyBag.getBoxes();

        for (int i = 0; i < this.candyBag.getUsedCapacity(); i++) {
            System.out.println(boxes[i].toString());
        }
    }
}
