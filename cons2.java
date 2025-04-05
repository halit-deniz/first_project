package halit;

public class cons2 {
	//fields
	String ulke;
	int nufusSayisi;
	int yuzOlcumu;
	String km;
	//constructor
	public cons2 (String ulke,int nufusSayisi,int yuzOlcumu){
		this.ulke=ulke;
		this.yuzOlcumu=yuzOlcumu;
		this.nufusSayisi=nufusSayisi;
		this.km=km;
		System.out.println("Ülke :" +ulke);
		System.out.println("Yuz Olcumu :" +yuzOlcumu+"km");
		System.out.println("Nufus Sayisi :" +nufusSayisi);
	}
		public static void main(String[]args) {
			
		cons2 Cons2 = new cons2("Suriye",1000000,5000);
	
	}

}
