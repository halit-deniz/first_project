import java.util.Scanner;
public class tunahan {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
	System.out.println("Bir Isim Giriniz: ");
	
	String isim = scan.nextLine();
	
	for (int i = 0; i < isim.length(); i++) {
		System.out.println(isim.charAt(i));
	}

	}
}

