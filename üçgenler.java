import java.util.Scanner;

public class üçgenler {
	public static void main(String[] args) {
Scanner scan=new Scanner (System.in);

System.out.println("kenar1 giriniz");
int kenar1=scan.nextInt();

System.out.println("kenar2 giriniz");
int kenar2=scan.nextInt();

System.out.println("kenar3 giriniz");
int kenar3=scan.nextInt();

if	((kenar1==kenar2)&&(kenar2==kenar3)) {
	System.out.println("Eskenar ucgen");
	}
	else if ((kenar1==kenar2 ||kenar2==kenar3 ||kenar1==kenar3)) {
	System.out.println("Ikizkenar ucgen");}
	else if ((kenar1!=kenar2||kenar2!=kenar3||kenar1!=kenar3)) {
		System.out.println("Cesitkenar ucgen");}

	
	

}
	}