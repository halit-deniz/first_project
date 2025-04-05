import java.util.Scanner;

public class Class11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		int sayi = scanner.nextInt();
	
		int toplam = 0;
	 
		for(int i = 0 ; i <= sayi ; i++) {
		if((i % 3 == 0 && i % 4 == 0)) {
			toplam+=i;
		
		} 
		}
		System.out.println("hem 3 e hem 4 e bolunebilen sayilarin toplami= " +toplam);
			scanner.close();
	
	}

}
