
public class ataturk {
	public static void main(String[] args) {
		String kelime1 = "mustafa";
		String kelime2= "kemal";
		String kelime3 = "ataturk";

		String ikincikarakterler = "" + kelime3.charAt(0) + kelime1.charAt(0) + kelime2.charAt(0);
		System.out.println("2.karakterler yan yana: " + ikincikarakterler);
		int ataturkUzunluk = kelime3.length();
		for (int i = 0; i < ataturkUzunluk; i++) {
			System.out.println(ikincikarakterler);
		}
	}
}
