package com.bilgeadam.enums;

public enum DersAdi {

	MATEMATIK(4), TURKCE(4), TARIH(3), COGRAFYA(2);
	
	private int value;
	
	DersAdi(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String degeriYazdir(){
		switch (this.ordinal()) {
		case 0:
			return "Matematik";
		case 1:
			return "T�rk�e";
		case 2:
			return "Tarih";
		case 3:
			return "Co�rafya";
		default:
			return null; 
		}
	}
}
