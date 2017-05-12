package com.bilgeadam.test;

import java.util.List;

import com.bilgeadam.domain.Ders;
import com.bilgeadam.domain.Ogrenci;
import com.bilgeadam.dummydata.DersDummy;

public class TestOgrenci {

	public static void main(String[] args) {
		
		List<Ders> dersler = DersDummy.verileriOlustur();
		Ogrenci o1 = new Ogrenci("123123", 2, dersler, "12332423223", "Metin", "Aln", 33);
		// System.out.println(o1);
		 o1.ogrencininDurumunuGoster();
		// o1.agirlikliOrtalamayaGoreOgrenciDurumu();
	}
}
