package halit;
import java.io.FileWriter;
import java.io.IOException;
import  java.io.File;

public class yazdırma {
    public static void main(String[] 	args) {
        String dosyaAdi = "deneme1234.txt";
        String isim = "benim adim verici bedo";

        try (FileWriter yazici = new FileWriter(dosyaAdi, true)) {
            yazici.write(isim + "\n");
            System.out.println("İsim dosyaya başarıyla yazıldı.");
        } catch (IOException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }
}
