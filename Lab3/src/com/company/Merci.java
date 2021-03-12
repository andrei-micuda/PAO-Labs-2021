package com.company;

public class Merci extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Merci()
    {
        super();
        this.length = 1f;
        this.height = 1f;
        this.width = 1f;
    }

    public Merci(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume()
    {
        return this.length * this.height * this.width;
    }

    @Override
    public String toString() {
        return "Merci, the " + this.origin + " " + this.flavor + " chocolate has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Merci merci = (Merci) o;

        return super.equals(merci);
    }

    @Override
    public int hashCode() {
        int result = (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        return result;
    }
}
