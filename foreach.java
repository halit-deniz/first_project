import java.util.Scanner;
public class foreach {

	public static void main(String[] args) {

	int []yaslar =  {4,5,6,90,8,9,10};
	
	int toplam = 0;
	int ort = 0;
	for (int i: yaslar) {
	
	toplam += i;

	}
	ort=toplam/yaslar.length;
	System.out.println("dizi toplam: " +toplam);
	System.out.println("ortalama: " +ort); 

	
	}
}
