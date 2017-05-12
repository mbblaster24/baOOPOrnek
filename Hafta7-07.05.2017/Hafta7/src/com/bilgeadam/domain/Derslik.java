package com.bilgeadam.domain;

import java.util.ArrayList;
import java.util.List;

public class Derslik {

	private List<Ogrenci> ogrenciler;
	private String derslikAdi;
	private List<Ders> dersler;
	private List<Periyod> periyodlar;
	private String egitmen;
	private List<String> assistanlar;
	
	public Derslik() {
		ogrenciler = new ArrayList<Ogrenci>();
		dersler = new ArrayList<Ders>();
		periyodlar = new ArrayList<Periyod>();
		assistanlar = new ArrayList<String>();
	}

	public Derslik(List<Ogrenci> ogrenciler, String derslikAdi,
			List<Ders> dersler, List<Periyod> periyodlar, String egitmen,
			List<String> assistanlar) {
		super();
		this.ogrenciler = ogrenciler;
		this.derslikAdi = derslikAdi;
		this.dersler = dersler;
		this.periyodlar = periyodlar;
		this.egitmen = egitmen;
		this.assistanlar = assistanlar;
	}

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public String getDerslikAdi() {
		return derslikAdi;
	}

	public void setDerslikAdi(String derslikAdi) {
		this.derslikAdi = derslikAdi;
	}

	public List<Ders> getDersler() {
		return dersler;
	}

	public void setDersler(List<Ders> dersler) {
		this.dersler = dersler;
	}

	public List<Periyod> getPeriyodlar() {
		return periyodlar;
	}

	public void setPeriyodlar(List<Periyod> periyodlar) {
		this.periyodlar = periyodlar;
	}

	public String getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}

	public List<String> getAssistanlar() {
		return assistanlar;
	}

	public void setAssistanlar(List<String> assistanlar) {
		this.assistanlar = assistanlar;
	}

	@Override
	public String toString() {
		return "Derslik [ogrenciler=" + ogrenciler + ", derslikAdi="
				+ derslikAdi + ", dersler=" + dersler + ", periyodlar="
				+ periyodlar + ", egitmen=" + egitmen + ", assistanlar="
				+ assistanlar + "]";
	}
}
