package com.overriding;

public class Kfc1 extends Kfc {
	public void ChickenNuggets() {
		System.out.println("5Piece");
	}
	public void ChickenBurger() {
		System.out.println("1piece");
	}
	public void FrenchFries() {
		System.out.println("200grams");
}
	public static void main(String[] args) {
		Kfc1 v=new Kfc1();
		v.ChickenNuggets();
		v.ChickenBurger();
		v.FrenchFries();
	}
		
	}
