package OOPGiris;

public class kitap {
	String baslik;
	int yayinYili;
	
	public kitap(String baslik, int yayinYili) {
		this.baslik = baslik;
		this.yayinYili= yayinYili;
		
	}
public void BilgileriGöster()
{
	System.out.println("Başlık: "+baslik+"Yayın yılı: "+yayinYili);
	}
}
