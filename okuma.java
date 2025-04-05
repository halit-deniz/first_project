package halit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class okuma {
    public static void main(String[] args) {
        String dosyaAdi = "input.txt";

        try (BufferedReader okuyucu = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = okuyucu.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }
}
