package com.company;

public class Lindt extends CandyBox {
    private float length;

    public Lindt() {
        this.length = 1f;
    }

    public Lindt(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString() {
        return "Lindt, the " + this.origin + " " + this.flavor + " chocolate has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lindt lindt = (Lindt) o;

        return super.equals(lindt);
    }

    @Override
    public int hashCode() {
        return (length != +0.0f ? Float.floatToIntBits(length) : 0);
    }
}
