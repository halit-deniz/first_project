import java.util.Scanner;
public class metod2 {
	public static void metod1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. sayiyi giriniz");
		double  sayi1=scan.nextDouble();
		System.out.println("2. sayiyi giriniz");
		double sayi2=scan.nextDouble();
		metod2(sayi1,sayi2);
	}
	public static void metod2(double x, double y) {
		if (x>y){
			System.out.println("ilk girdiginiz sayi daha buyuk");
			}else { 
				System.out.println(y);
			}
	}
	public static void main(String[] args) {
metod1();
/*3 tane metod tanimla 1.metod kullanicidan 2 tane sayi alacak bu sayilar 2.metoda parametre olarak gonderilecek 
		2.metodda bu iki sayidan biuyuk olani bulup 3.metoddamuz olan main metodunda cagiracaksiniz.*/
			}

}