package com.bilgeadam.test;

import java.util.List;

import com.bilgeadam.domain.Ders;
import com.bilgeadam.dummydata.DersDummy;


public class TestDers {

	public static void main(String[] args) {
		
		List<Ders> dersler = DersDummy.verileriOlustur();
		System.out.println(dersler.get(0).derstenGectiMi());
		System.out.println(dersler.get(0).dersinOrtalamasiniHesapla());
		System.out.println(dersler.get(0).getDersAdi().degeriYazdir());
		
	}
}
