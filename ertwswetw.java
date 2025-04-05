	import java.util.Scanner;
	public class ertwswetw {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String name = "";	
	do{
	System.out.println("Isminizi Giriniz: ");
	name = scanner.nextLine();
	}
	while(name.isBlank()) ;
	System.out.println("Merhaba " + name);

	}
	}
