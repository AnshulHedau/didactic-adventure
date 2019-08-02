package com.visa.training;

public class ChemicalElement {

	private int atomicNumber;
	private String symbolicName, fullName;
	private static boolean arrayIsMetal[] = new boolean[117];
	static {
		arrayIsMetal[13] = true;
		arrayIsMetal[49] = true;
		arrayIsMetal[50] = true;
		arrayIsMetal[81] = true;
		arrayIsMetal[82] = true;
		arrayIsMetal[83] = true;
		arrayIsMetal[113] = true;
		arrayIsMetal[114] = true;
		arrayIsMetal[115] = true;
		arrayIsMetal[116] = true;
	}

	public ChemicalElement(int atomicNumber, String symbolicName, String fullName) {
		this.atomicNumber = atomicNumber;
		this.symbolicName = symbolicName;
		this.fullName = fullName;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getSymbolicName() {
		return symbolicName;
	}

	public String getFullName() {
		return fullName;
	}

	public boolean isAlkaliMetal() {
		switch (this.atomicNumber) {
		case 3:
		case 11:
		case 19:
		case 37:
		case 55:
		case 87:
			return true;
		default:
			return false;
		}
	}

	public boolean isTransitionMetal() {
		return (this.atomicNumber >= 21 && this.atomicNumber <= 31)
				|| (this.atomicNumber >= 39 && this.atomicNumber <= 48)
				|| (this.atomicNumber >= 72 && this.atomicNumber <= 80)
				|| (this.atomicNumber >= 104 && this.atomicNumber <= 112);

	}

	public boolean isMetal() {
		return arrayIsMetal[this.atomicNumber];
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof ChemicalElement) {
			ChemicalElement n = (ChemicalElement) o;
			if (this.atomicNumber == n.atomicNumber) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
