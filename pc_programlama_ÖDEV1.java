	import java.util.Scanner;
	public class pc_programlama_ÖDEV1 {

	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
	System.out.println("Bir tam sayı giriniz :");
	int number =scan.nextInt();
	int i =0;
	while (number % 10 == 0 && number != 0) {
	i++;
	number /=10;
	}
	System.out.println(i  + " tane sıfır vardır.");
	}}
