import java.util.Scanner;
public class faktoryel {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz");
		int sayi = scanner.nextInt();
		int faktoryel = 0;
		for (int i = 0; i <= sayi; i++) {
			faktoryel *= i;
		}
		System.out.println(sayi + "! =" + faktoryel);
	
}}