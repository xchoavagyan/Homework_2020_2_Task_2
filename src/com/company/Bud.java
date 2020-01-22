package com.company;

public class Bud {
    private String size;
    private String smell;

    public Bud(String size, String smell) {
        this.size = size;
        this.smell = smell;
    }

    public Bud() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bud bud = (Bud) o;

        if (size != null ? !size.equals(bud.size) : bud.size != null) return false;
        return smell != null ? smell.equals(bud.smell) : bud.smell == null;
    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + (smell != null ? smell.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bud{" +
                "size='" + size + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
