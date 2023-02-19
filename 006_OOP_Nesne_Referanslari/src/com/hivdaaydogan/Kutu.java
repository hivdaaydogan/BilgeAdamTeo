package com.hivdaaydogan;

public class Kutu {
	
	public int hacim;
	public String kutununAdi;
	public String sahininAdi;
	public String kutununGidecegiAdres;
	
	public void degistir(int sayi) {
		hacim = sayi;
	}
	
	public void degistir2(int sayi) {
		int sonuc = sayi * sayi;
		sayi = sonuc;
	}
	
	public int degistir3(int sayi) {
		int sonuc = sayi * sayi;
		sayi = sonuc;
		return sonuc;
	}

	
	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 20;
		System.out.println(kutu1.hacim);
		kutu1.degistir(30);
		System.out.println(kutu1.hacim);
		
		
		int s = 5;
		kutu1.degistir2(s);
		System.out.println(s);
		
		// void return eden metodları system.out.println() içine yazamayız.
		System.out.println("değiştir3: " + kutu1.degistir3(s));
		
		
		Kutu kutu2;
		kutu2 = kutu1;
		kutu2.degistir(40);
		System.out.println(kutu1.hacim);
		System.out.println(kutu2.hacim);
		
		Kutu kutu3;
		kutu3 = kutu2;
		System.out.println(kutu3.hacim);
		
		kutu3 = new Kutu();
		System.out.println(kutu3.hacim);
		
		System.out.println(kutu2.hacim);  
	}
}
