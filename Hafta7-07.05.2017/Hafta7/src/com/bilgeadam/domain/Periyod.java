package com.bilgeadam.domain;

import java.util.Date;

import com.bilgeadam.enums.Gun;

public class Periyod {

	private Date baslangicSaati;
	private Date bitisSaati;
	private Gun gun;
	
	public Periyod() {
		
	}

	public Periyod(Date baslangicSaati, Date bitisSaati, Gun gun) {
		super();
		this.baslangicSaati = baslangicSaati;
		this.bitisSaati = bitisSaati;
		this.gun = gun;
	}

	public Date getBaslangicSaati() {
		return baslangicSaati;
	}

	public void setBaslangicSaati(Date baslangicSaati) {
		this.baslangicSaati = baslangicSaati;
	}

	public Date getBitisSaati() {
		return bitisSaati;
	}

	public void setBitisSaati(Date bitisSaati) {
		this.bitisSaati = bitisSaati;
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

	@Override
	public String toString() {
		return "Periyod [baslangicSaati=" + baslangicSaati + ", bitisSaati="
				+ bitisSaati + ", gun=" + gun + "]";
	}
}
