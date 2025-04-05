package halit;

public class main {
	public static void main(String[]args) {
		
		halit_okul ogrenci1 = new halit_okul(240905035,20,"Halit","Deniz");
		
		System.out.println("Ogrenci Bilgileri");
		System.out.println("Isim :" + ogrenci1.isim);
		System.out.println("Soyisim: " +ogrenci1.soyisim);
		System.out.println("Yasi :" + ogrenci1.yas);
		System.out.println("Okul Numarasi :" + ogrenci1.okulno);


	}

}
