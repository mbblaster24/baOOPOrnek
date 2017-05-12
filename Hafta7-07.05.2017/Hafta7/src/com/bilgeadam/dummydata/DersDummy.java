package com.bilgeadam.dummydata;

import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.domain.Ders;
import com.bilgeadam.enums.DersAdi;

public class DersDummy {
	
	public DersDummy() {
		
	}

	public static List<Ders> verileriOlustur() {
		
		List<Integer> d1Yazililar = new ArrayList<Integer>();
		d1Yazililar.add(50);
		d1Yazililar.add(70);
		d1Yazililar.add(90);
		
		List<Integer> d1Sozluler = new ArrayList<Integer>();
		d1Sozluler.add(100);
		d1Sozluler.add(100);
		
		boolean zorunluMu = true;
		boolean alanDersiMi = true;
		Ders d1 = new Ders(DersAdi.MATEMATIK, zorunluMu, alanDersiMi, d1Yazililar, d1Sozluler);
		
		List<Integer> d2Yazililar = new ArrayList<Integer>();
		d2Yazililar.add(10);
		d2Yazililar.add(20);
		d2Yazililar.add(40);
		
		List<Integer> d2Sozluler = new ArrayList<Integer>();
		d2Sozluler.add(50);
		d2Sozluler.add(80);
		
		zorunluMu = true;
		alanDersiMi = false;
		Ders d2 = new Ders(DersAdi.TURKCE, zorunluMu, alanDersiMi, d2Yazililar, d2Sozluler);
		
		List<Integer> d3Yazililar = new ArrayList<Integer>();
		d3Yazililar.add(100);
		d3Yazililar.add(90);
		
		List<Integer> d3Sozluler = new ArrayList<Integer>();
		d3Sozluler.add(50);
		d3Sozluler.add(50);
		
		zorunluMu = false;
		alanDersiMi = false;
		Ders d3 = new Ders(DersAdi.TARIH, zorunluMu, alanDersiMi, d3Yazililar, d3Sozluler);
		
		List<Ders> tempDersler = new ArrayList<Ders>();
		tempDersler.add(d1);
		tempDersler.add(d2);
		tempDersler.add(d3);
		
		return tempDersler;
	}
}
