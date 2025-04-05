package OOPGiris;

public class yazar {
	String isim;
	String ulke;
	
	public yazar() {
		
	}
	public yazar(String isim,String ulke) {
	this.isim=isim;
	this.ulke=ulke;
	}
	public void BilgileriGoster() {
		System.out.println("Ad: "+isim);
		System.out.println("Ulke: "+ulke);
		
	}
	
}





//bir tane yazar isimli class olusturun.
//yazar classi nin ad ve ulke ozellikleri olsun. 1 tane de BilgileriGoster metodu olsun
// bir tane de kitap isimli class olusturun.
//kitap isimli classin baslik  ve yayinYili diye 2 ozelligi olsun. 1 tane de BilgileriGoster metodu olsun.
// main de kullan.