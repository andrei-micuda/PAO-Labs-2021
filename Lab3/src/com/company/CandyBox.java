package com.company;

public abstract class CandyBox {
    protected String flavor;
    protected String origin;

    public CandyBox()
    {
        this.flavor = "chocolate";
        this.origin = "France";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public abstract float getVolume();

    @Override
    public String toString() {
        return "CANDY BOX" +
                "\nFlavor: " + this.flavor +
                "\nOrigin: " + this.origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyBox candyBox = (CandyBox) o;

        if (flavor != null ? !flavor.equals(candyBox.flavor) : candyBox.flavor != null) return false;
        if (origin != null ? !origin.equals(candyBox.origin) : candyBox.origin != null) return false;
        return this.getVolume() == candyBox.getVolume();
    }

    @Override
    public int hashCode() {
        int result = flavor != null ? flavor.hashCode() : 0;
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        return result;
    }
}
