package OOPGiris;

public class Main {

	public static void main(String[] args) {

		//obje oluşturma
		OgrenciSistem ogrenci1=new OgrenciSistem();
		OgrenciSistem ogrenci2=new OgrenciSistem(4,"Halit","BABBA",65,10);
		
		
		
		ogrenci1.id=8;
		ogrenci1.isim="Emir";
		ogrenci1.soyIsim= "Kartal";
		ogrenci1.sinav1=10;
		ogrenci1.sinav2=50;
		
		ogrenci1.Ortalama();
		ogrenci1.Yazdir();
		
		
		
		//bir tane yazar isimli class olusturun.
		//yazar classi nin ad ve ulke ozellikleri olsun. 1 tane de BilgileriGoster metodu olsun
		// bir tane de kitap isimli class olusturun.
		//kitap isimli classin baslik  ve yayinYili diye 2 ozelligi olsun. 1 tane de BilgileriGoster metodu olsun.
		// main de kullan.
		
		
		
		
		
	}

}