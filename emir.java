import java.util.Scanner;

public class emir{
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Adınızı Giriniz");
		String isim=scanner.nextLine();
		
		System.out.println("Yariçap");
		int yaricap=scanner.nextInt();
		
		System.out.println("pi:");
		double pi=scanner.nextDouble();
		
		double alan=yaricap*pi*yaricap;
		double cevre=2*pi*yaricap;
		System.out.println("ALAN:"+alan);
		System.out.println("CEVRE:"+cevre);

}}

