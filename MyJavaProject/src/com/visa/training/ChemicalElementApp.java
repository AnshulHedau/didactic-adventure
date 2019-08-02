package com.visa.training;

public class ChemicalElementApp {

	public static void main(String[] args) {
		ChemicalElement c = new ChemicalElement(1, "H", "Hydrogen");
		ChemicalElement d = new ChemicalElement(1, "H", "Hydrogen");
		System.out.println("Element "+ c.getFullName()+" with atomic number "+c.getAtomicNumber() + c.getSymbolicName() + c.isAlkaliMetal());
		System.out.println(d.getAtomicNumber() + d.getFullName() + d.getSymbolicName() + d.isAlkaliMetal());
		System.out.println(c.equals(d));

	}

}
