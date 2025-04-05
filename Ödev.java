import java.io.*;

public class Ödev {
    public static void main(String[] args) {
        try {
            // Giriş ve çıkış dosyalarını aç
            BufferedReader okuyucu = new BufferedReader(new FileReader("C:\\Users\\Pc\\Desktop\\240905035\\src\\input.txt"));
            BufferedWriter yazici = new BufferedWriter(new FileWriter("C:\\Users\\Pc\\Desktop\\240905035\\src\\output.txt"));

            String satir;
            while ((satir = okuyucu.readLine()) != null) {
                // Komutları işleme
                if (satir.equalsIgnoreCase("Exit")) {
                    break; // "Exit" komutu varsa işlemi bitir
                }

                if (satir.equalsIgnoreCase("Armstrong")) {
                    int sinir = Integer.parseInt(okuyucu.readLine().trim());
                    yazici.write("Armstrong " + sinir + ":\n");
                    for (int i = 1; i <= sinir; i++) {
                        if (armstrongMu(i)) {
                            yazici.write(i + " ");
                        }
                    }
                    yazici.write("\n\n");
                } else if (satir.equalsIgnoreCase("Emirp")) {
                    int sinir = Integer.parseInt(okuyucu.readLine().trim());
                    yazici.write("Emirp " + sinir + ":\n");
                    for (int i = 1; i <= sinir; i++) {
                        if (emirpMu(i)) {
                            yazici.write(i + " ");
                        }
                    }
                    yazici.write("\n\n");
                } else {
                    System.out.println("Bilinmeyen Komut: " + satir);
                }
            }

            yazici.write("Bitti\n");
            okuyucu.close();
            yazici.close();
            System.out.println("Sonuçlar 'output.txt' dosyasına yazıldı.");
        } catch (IOException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }

    public static boolean armstrongMu(int sayi) {
        String sayiStr = String.valueOf(sayi);
        int basamakSayisi = sayiStr.length();
        int toplam = 0, gecici = sayi;

        while (gecici > 0) {
            int basamak = gecici % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            gecici /= 10;
        }
        return toplam == sayi;
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false;
        }
        return true;
    }

    public static boolean emirpMu(int sayi) {
        if (!asalMi(sayi)) return false;

        long tersSayi; // Uzun tipte tanımlama
        try {
            tersSayi = Long.parseLong(new StringBuilder(String.valueOf(sayi)).reverse().toString());
        } catch (NumberFormatException e) {
            System.out.println("Ters çevrilen sayı çok büyük: " + sayi);
            return false;
        }

        return asalMi((int) tersSayi) && tersSayi != sayi;
    }
}