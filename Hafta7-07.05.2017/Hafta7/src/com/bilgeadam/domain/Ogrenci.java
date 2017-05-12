package com.bilgeadam.domain;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends Kisi {
	
	private String ogrenciNo;
	private int sinif;
	private List<Ders> dersler;
	
	public Ogrenci(){
		dersler = new ArrayList<Ders>();
	}

	public Ogrenci(String ogrenciNo, int sinif, List<Ders> dersler) {
		this.ogrenciNo = ogrenciNo;
		this.sinif = sinif;
		this.dersler = dersler;
	}
	
	public Ogrenci(String ogrenciNo, int sinif, List<Ders> dersler,
			String TCKimlikNo, String isim, String soyisim, int yas) {
		super(TCKimlikNo, isim, soyisim, yas);
		
		this.ogrenciNo = ogrenciNo;
		this.sinif = sinif;
		this.dersler = dersler;
	}

	public void ogrencininDurumunuGoster(){
		
		for (Ders ders : dersler) {
			String durum = ders.derstenGectiMi() ? "Geçti" : "Kaldý";
			System.out.println
				(ders.getDersAdi().degeriYazdir() + " - " + ders.dersinOrtalamasiniHesapla() + " - " + durum);
		}
	}
	
	public void agirlikliOrtalamayaGoreOgrenciDurumu(){
		
		double toplam = 0;
		int agirlikToplami = 0;
		for (Ders ders : dersler) {
			toplam = toplam + ders.agirlikliOrtalamaHesapla();
			agirlikToplami = agirlikToplami + ders.getDersAdi().getValue();
		}
		
		System.out.println("Öðrencinin aðýrlýklý ortalamasý ==> " + toplam/agirlikToplami);
		
	}
	
	public double genelOrtalamaHesapla(){
		// TODO: eklenecek
		return 0;
	}
	
	public double alanDersleriOrtalamasiniHesapla(){
		// TODO: eklenecek
		return 0;
	}
	
	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	public List<Ders> getDersler() {
		return dersler;
	}

	public void setDersler(List<Ders> dersler) {
		this.dersler = dersler;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Öðrenci No: ");
		sb.append(this.ogrenciNo);
		sb.append(", Sýnýf: ");
		sb.append(this.sinif);
		sb.append(", Dersler: ");
		sb.append(this.dersler);
		sb.append(", TC Kimlik No: ");
		sb.append(super.getTCKimlikNo());
		sb.append(", Ýsim: ");
		sb.append(super.getIsim());
		sb.append(", Soyisim: ");
		sb.append(super.getSoyisim());
		sb.append(", Yaþ: ");
		sb.append(super.getYas());
		
		return sb.toString();
	}
}
