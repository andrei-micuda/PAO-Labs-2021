package com.company;

public class Milka extends CandyBox {
    private float radius;
    private float height;

    public Milka() {
        this.radius = 1f;
        this.height = 1f;
    }

    public Milka(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float)Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public String toString() {
        return "Milka, the " + this.origin + " " + this.flavor + " chocolate has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Milka milka = (Milka) o;

        return super.equals(milka);
    }

    @Override
    public int hashCode() {
        int result = (radius != +0.0f ? Float.floatToIntBits(radius) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        return result;
    }
}
