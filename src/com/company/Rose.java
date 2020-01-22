package com.company;

import java.util.ArrayList;

public class Rose {
    private String nameOfRose;
    private ArrayList<Petal> petals = new ArrayList<>();

    public Rose(String nameOfRose, ArrayList<Petal> petals) {
        this.nameOfRose = nameOfRose;
        this.petals = petals;
    }

    public Rose() {
    }

    public String getNameOfRose() {
        return nameOfRose;
    }

    public void setNameOfRose(String nameOfRose) {
        this.nameOfRose = nameOfRose;
    }

    public ArrayList<Petal> getPetals() {
        return petals;
    }

    public void setPetals(ArrayList<Petal> petals) {
        this.petals = petals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rose rose = (Rose) o;

        if (nameOfRose != null ? !nameOfRose.equals(rose.nameOfRose) : rose.nameOfRose != null) return false;
        return petals != null ? petals.equals(rose.petals) : rose.petals == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfRose != null ? nameOfRose.hashCode() : 0;
        result = 31 * result + (petals != null ? petals.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "nameOfRose='" + nameOfRose + '\'' +
                ", petals=" + petals +
                '}';
    }

    public void printQuantityOfPetals() {
        System.out.println(this.nameOfRose + " have " + this.petals.size() + " petals ");
    }

    public void bloom() {

        for (int i = 0; i < this.petals.size(); i++) {
            this.petals.get(i).setQuality(10);
        }
        System.out.println(this.nameOfRose + " is Blooming");
    }


    public void wilt() {

        for (int i = 0; i < this.petals.size(); i++) {
            this.petals.get(i).setQuality(1);
        }
        System.out.println(this.nameOfRose + " is wilting");

    }
}
