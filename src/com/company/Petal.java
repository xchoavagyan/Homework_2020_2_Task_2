package com.company;

public class Petal {
    private int quality;
    private String color;

    public Petal(int quality, String color) {
        this.quality = quality;
        this.color = color;
    }

    public Petal() {
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Petal petal = (Petal) o;

        if (quality != petal.quality) return false;
        return color != null ? color.equals(petal.color) : petal.color == null;
    }

    @Override
    public int hashCode() {
        int result = quality;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Petal{" +
                "quantity=" + quality +
                ", color='" + color + '\'' +
                '}';
    }
}
