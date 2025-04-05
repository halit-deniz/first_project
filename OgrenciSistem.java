package OOPGiris;

public class OgrenciSistem {
	//fields (ozellikler)
	int id;
	String isim;
	String soyIsim;
	int sinav1;
	int sinav2;
	
	//Counstructor (Yapici metod)
	public OgrenciSistem() {
		
	}
	//Parametreli Counstructor
public OgrenciSistem(int id, String isim, String soyIsim, int sinav1,int sinav2) {
	id =id;
	isim=isim;
	soyIsim=soyIsim;
	sinav1=sinav1;
	sinav2=sinav2;
	
}
public OgrenciSistem(String isim, String soyIsim) {
	isim=isim;
	soyIsim=soyIsim;
	
}
public double Ortalama() {
	double ortalama = (sinav1+sinav2)/2;
	System.out.println("Ortalama: "+ortalama);
return ortalama;
}
public void Yazdir() {
	System.out.println("Ad: "+isim);
	System.out.println("Soyisim: "+soyIsim);
}
	
}