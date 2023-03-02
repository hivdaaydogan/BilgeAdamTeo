package com.hivdaaydogan.repository;

import java.util.List;

import com.hivdaaydogan.repository.entity.Ogrenci;
import com.hivdaaydogan.repository.entity.Ogretmen;
import com.hivdaaydogan.utility.DataBase;

public class OgretmenRepository {

	public void save(Ogretmen ogretmen) {
		DataBase.ogretmenListesi.add(ogretmen);
	}

	public void delete(int id) {
		Ogretmen silinecekOgretmen = null;
		
		for(Ogretmen ogr : DataBase.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				silinecekOgretmen = ogr;
				break;
			}
		}
		
		if(silinecekOgretmen != null) {
			DataBase.ogrenciListesi.remove(silinecekOgretmen);
		}
		
	}

	public void update(Ogretmen ogretmen) {
		for(int i=0;i<DataBase.ogretmenListesi.size();i++) {
			if(DataBase.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo()) {
				DataBase.ogretmenListesi.get(i).setAdi(ogretmen.getAdi());
				DataBase.ogretmenListesi.get(i).setSoyadi(ogretmen.getSoyadi());
			}
		}	
		
	}

	public Ogretmen findById(int id) {
		Ogretmen tempOgretmen = null;
		
		for(Ogretmen ogr : DataBase.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				tempOgretmen= ogr;
				break;
			}
		}
		return tempOgretmen;
	}

	public List<Ogretmen> findall() {

		return DataBase.ogretmenListesi;
	}
	
	
	

}
