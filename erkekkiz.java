import java.util.Scanner;
public class erkekkiz {
	public static void main(String[] args) {

		Scanner entry=new Scanner (System.in);
		
		System.out.println("yas giriniz");
		int yas=entry.nextInt();	
	
		entry.nextLine();
	
	System.out.println("Cinsiyet Giriniz(K veya E)");
	
	char cins=entry.nextLine().charAt(0);
		if (yas>=18) {
		if(cins=='K'||cins=='k') {
		System.out.println("Resit Kadin");
		}
		else if(cins=='E'||cins=='e') 
		System.out.println("Resit Erkek");
		}
		else System.out.println("Resit Degilsiniz(yenirD)");
			
		
		
	}

}
