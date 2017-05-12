package com.bilgeadam.domain;

import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.enums.DersAdi;

public class Ders {
	
	private DersAdi dersAdi; 
	private boolean zorunluMu;
	private boolean alanDersiMi;
	private List<Integer> yazililar;
	private List<Integer> sozluler;
	public static final int GECME_NOTU = 60;
	
	public double dersinOrtalamasiniHesapla(){
		
		Integer toplam = 0;
		for (Integer yazili : yazililar) {
			toplam = toplam + yazili;
		}
		
		for (int i = 0; i < sozluler.size(); i++) {
			toplam = toplam + sozluler.get(i);
		}
		
		return toplam/(yazililar.size()+sozluler.size());
	}
	
	public double agirlikliOrtalamaHesapla(){
		
		return dersinOrtalamasiniHesapla() * dersAdi.getValue();
	}
	
	public boolean derstenGectiMi(){

		return dersinOrtalamasiniHesapla() >= GECME_NOTU;
	}
	
	public Ders(){
		yazililar = new ArrayList<Integer>();
		sozluler = new ArrayList<Integer>();
	}
	
	public Ders(DersAdi dersAdi, boolean zorunluMu, boolean alanDersiMi,
			List<Integer> yazililar, List<Integer> sozluler) {
		this.dersAdi = dersAdi;
		this.zorunluMu = zorunluMu;
		this.alanDersiMi = alanDersiMi;
		this.yazililar = yazililar;
		this.sozluler = sozluler;
	}

	public DersAdi getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(DersAdi dersAdi) {
		this.dersAdi = dersAdi;
	}
	public boolean isZorunluMu() {
		return zorunluMu;
	}
	public void setZorunluMu(boolean zorunluMu) {
		this.zorunluMu = zorunluMu;
	}
	public boolean isAlanDersiMi() {
		return alanDersiMi;
	}
	public void setAlanDersiMi(boolean alanDersiMi) {
		this.alanDersiMi = alanDersiMi;
	}
	public List<Integer> getYazililar() {
		return yazililar;
	}
	public void setYazililar(List<Integer> yazililar) {
		this.yazililar = yazililar;
	}
	public List<Integer> getSozluler() {
		return sozluler;
	}
	public void setSozluler(List<Integer> sozluler) {
		this.sozluler = sozluler;
	}

	@Override
	public String toString() {
		return "Ders [dersAdi=" + dersAdi + ", zorunluMu=" + zorunluMu
				+ ", alanDersiMi=" + alanDersiMi + ", yazililar=" + yazililar
				+ ", sozluler=" + sozluler + "]";
	}
}
