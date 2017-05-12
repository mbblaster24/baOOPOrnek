package com.bilgeadam.domain;

public class Kisi {
	
	private String TCKimlikNo;
	private String isim;
	private String soyisim;
	private int yas;
	
	public Kisi(){
		
	}
	
	public Kisi(String tCKimlikNo, String isim, String soyisim, int yas) {
		TCKimlikNo = tCKimlikNo;
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}



	public String getTCKimlikNo() {
		return TCKimlikNo;
	}
	
	public void setTCKimlikNo(String tCKimlikNo) {
		TCKimlikNo = tCKimlikNo;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Kisi [TCKimlikNo=" + TCKimlikNo + ", isim=" + isim
				+ ", soyisim=" + soyisim + ", yas=" + yas + "]";
	}
}
