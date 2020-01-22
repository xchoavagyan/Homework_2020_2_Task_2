package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	2 create class Rose using classes Petal and Bud

	methods
		bloom()
		wilt()
		printQuantityOfPetals
	 */

    Bud redRoseBud = new Bud("Big", "Very good smell");

    Petal petalOfRedRose1 = new Petal(10, "red");
    Petal petalOfRedRose2 = new Petal(10, "red");
    Petal petalOfRedRose3 = new Petal(10, "red");
    Petal petalOfRedRose4 = new Petal(10, "red");
    ArrayList<Petal> redPetals = new ArrayList<>();
    redPetals.add(petalOfRedRose1);
    redPetals.add(petalOfRedRose2);
    redPetals.add(petalOfRedRose3);
    redPetals.add(petalOfRedRose4);

    Bud whiteRoseBud = new Bud("Small", "Smells Bad");

    Petal petalOfWhiteRose1 = new Petal(2, "white");
    Petal petalOfWhiteRose2 = new Petal(2, "white");
    Petal petalOfWhiteRose3 = new Petal(2, "white");
    Petal petalOfWhiteRose4 = new Petal(2, "white");
    Petal petalOfWhiteRose5 = new Petal(2, "white");
    ArrayList<Petal> whitePetals = new ArrayList<>();
    whitePetals.add(petalOfWhiteRose1);
    whitePetals.add(petalOfWhiteRose2);
    whitePetals.add(petalOfWhiteRose3);
    whitePetals.add(petalOfWhiteRose4);
    whitePetals.add(petalOfWhiteRose5);

    Rose roseRed = new Rose("Opium",redPetals);
    Rose roseWhite = new Rose("Escimo",whitePetals);
    roseRed.printQuantityOfPetals();
    roseWhite.printQuantityOfPetals();
    roseRed.wilt();
    roseWhite.bloom();


    }
}
