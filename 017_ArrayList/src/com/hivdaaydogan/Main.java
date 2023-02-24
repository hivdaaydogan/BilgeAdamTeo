package com.hivdaaydogan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	private static void printArrayList(List<Kisi> list) {
		System.out.println("\n************\n");
		for(Kisi kisi : list) {
			System.out.println(kisi);
		}
	}
	
	public static void printList(List<String> list) {
		System.out.println();
		for (String name : list) {
			System.out.println(name);
		}
	}
	
	
	private static List<String> listeOlustur() {
//		List<String> lst = new ArrayList<>();
//		lst.add("Ali");
//		lst.add("Veli");		
//		return lst;
		
		List<String> lst = new LinkedList<>();
		lst.add("Ali");
		lst.add("Veli");		
		return lst;
		
	}
	

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println(cars);
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		// ************************************************************************
		// ArrayList içine primitive veri tipleri yazılmaz bunların yerine onların wrapper sınıfları yazılır.
		// Ör.
		// int => Integer
		// float => Float ... gibi
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(7);
		arrList.add(10);
		System.out.println(arrList);
		
		// ArrayList'ler içinde kendi nesnelerimizin kullanımı:
		System.out.println();
		Kisi k1 = new Kisi("John", "Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Robert");
		k2.setSoyad("Donavan");
		Kisi k3 = new Kisi("Ali", "Kaya");
		
		ArrayList<Kisi> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		Main.printArrayList(list);
		
		// Remove: 2 Remove yöntemi vardır; ilki nesne referansı gönderir ve onu çıkarır, ikincisi çıkarmak istediğiniz 
		// elemanın indexini gönderirsiniz.
		// list.remove(k2);
		list.remove(1);
		Main.printArrayList(list);
		
		//
		List<Kisi> list2 = new ArrayList<Kisi>();
		list2.add(new Kisi("Ahmet", "Emre"));
		Main.printArrayList(list2);
		
		
		System.out.println();
		
		// ArrayList'lerde arraya eleman ekleme:
		//
		List<String> l = Main.listeOlustur();
		for (String s : l) {
			System.out.println(s);
		}
		
		l.add(1, "Ayşe");
		System.out.println();
		for(String s :l) {
			System.out.println(s);
		}
		
		
		// LİNKED LİST
		//
		// ArrayList hızlı random erişimi sağlar, dizinin içindeki herhangi bir elemanı sabit sürede getirir.
		// Ancak, ArrayList'te yapılan aradan eleman ekleme veya çıkarma gibi işlemler çok uzun vakit alır.
		
		// LinkedList'lerde ise araya eleman ekleme veya silme ArrayList'lere göre çok daha hızlı olur.
		// Ancak LinkList belirli bir indexteki elemana erişim hızında ArrayList'e göre çok daha yavaş kalır. 
		System.out.println(l.get(1));
		
		System.out.println("\n************\n");
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("John");
		linkedList.add("Barbara");
		//System.out.println(linkedList);
		
	
		Main.printList(linkedList);
		Main.printList(cars);
		
		linkedList.remove("John");
		Main.printList(linkedList);
		
		System.out.println(linkedList.get(0));
		
		// Araya eleman ekleme
		linkedList.add(1, "Robert");
		Main.printList(linkedList);
		
		
		
	}




}
