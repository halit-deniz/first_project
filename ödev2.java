import java.util.Scanner;

public class ödev2 {

	public static void main(String[] args) {
		int kapasite = 30;
		int mevcutkoltuk = 0;
		
		String [] yolcular = new String[kapasite];
		
		Scanner scan = new Scanner(System.in);
		
		while (mevcutkoltuk < kapasite) {
			System.out.println("Yolcunun adını ve soyadını giriniz: ");
		String yolcubilgisi = scan.nextLine();
		
		yolcular[mevcutkoltuk] = yolcubilgisi;
		mevcutkoltuk++;
		System.out.println("Koltuk atandı. Mevcut koltuk sayısı: " + mevcutkoltuk);
		}
		if(mevcutkoltuk == kapasite) {
			System.out.println("Otobüs doldu. Daha falza yolcu alınamaz");
		
		}
	scan.close();
	}

}
