		import java.util.Scanner;
		public class pc_programlama_ÖDEV2 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int açılış_ücreti = 100;
		final int km_başına_ücret = 25;
		final int minumum_ücret = 200 ;
		
		System.out.println("Doğum tarihinizi (gün.ay.yıl) formatında giriniz:");
		String dogumTarihi = scan.nextLine();
		int gidilenMesafe = 0;
		for (char c : dogumTarihi.toCharArray()) {
			if (Character.isDigit(c)) {
				gidilenMesafe += Character.getNumericValue(c); 
				} }
		int toplamUcret = açılış_ücreti + (gidilenMesafe * km_başına_ücret);
		if (toplamUcret < minumum_ücret) {
			toplamUcret = minumum_ücret; 
			}
		System.out.println("Gidilen mesafe: " + gidilenMesafe + " km");
		System.out.println("Toplam ücret: " + toplamUcret + " TL");
	}}
