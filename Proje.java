import java.util.Scanner;

public class Proje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini girin (°C): ");
        int sicaklik = scanner.nextInt();
        
        System.out.print("Lütfen hava durumunu girin (Güneşli, Yağmurlu, Karlı, Bulutlu, Rüzgarlı): ");
        String havaDurumu = scanner.next().toLowerCase();

        etkinlikOner(sicaklik, havaDurumu);

        scanner.close();
    }

    public static void etkinlikOner(int sicaklik, String havaDurumu) {
        if (sicaklik < -30) {
            System.out.println("Hipotermi tehlikesi, dışarı çıkmayın!");
        } else if (sicaklik > 40) {
            System.out.println("Cehennem sıcağı, mümkünse serin bir yerde kalın!");
        } else if (sicaklik >= 30) {
            switch (havaDurumu) {
                case "güneşli":
                    System.out.println("Bugün sıcak ve güneşli bir gün, plaja gidebilirsiniz!");
                    plajEtkinlikleri();
                    break;
                case "yağmurlu":
                    System.out.println("Sıcak ama yağmurlu bir gün, müzeyi ziyaret edebilirsiniz!");
                    muzeeEtkinlikleri();
                    break;
                case "karlı":
                    System.out.println("Sıcak ve kar yağışı var, doğa yürüyüşü yapmayı deneyebilirsiniz!");
                    dogaYuruyusuEtkinlikleri();
                    break;
                case "bulutlu":
                    System.out.println("Sıcak ve bulutlu bir gün, parkta yürüyüş yapabilirsiniz!");
                    parkYuruyusuEtkinlikleri();
                    break;
                case "rüzgarlı":
                    System.out.println("Sıcak ve rüzgarlı bir gün, uçurtma uçurabilirsiniz!");
                    rüzgarEtkinlikleri();
                    break;
                default:
                    System.out.println("Geçersiz hava durumu girdiniz.");
            }
        } else if (sicaklik >= 20) {
            switch (havaDurumu) {
                case "güneşli":
                    System.out.println("Hava güzel ve güneşli, piknik yapabilirsiniz!");
                    piknikEtkinlikleri();
                    break;
                case "yağmurlu":
                    System.out.println("Hava güzel ama yağmurlu, sinemaya gidebilirsiniz!");
                    sinemaEtkinlikleri();
                    break;
                case "karlı":
                    System.out.println("Hava güzel ama kar yağıyor, kayak yapmayı deneyebilirsiniz!");
                    kayakEtkinlikleri();
                    break;
                case "bulutlu":
                    System.out.println("Hava güzel ve bulutlu, bisiklet sürebilirsiniz!");
                    bisikletEtkinlikleri();
                    break;
                case "rüzgarlı":
                    System.out.println("Hava güzel ve rüzgarlı, doğa yürüyüşü yapabilirsiniz!");
                    dogaYuruyusuEtkinlikleri();
                    break;
                default:
                    System.out.println("Geçersiz hava durumu girdiniz.");
            }
        } else if (sicaklik >= 10) {
            switch (havaDurumu) {
                case "güneşli":
                    System.out.println("Hafif soğuk ama güneşli, kütüphanede zaman geçirebilirsiniz!");
                    kutuphaneEtkinlikleri();
                    break;
                case "yağmurlu":
                    System.out.println("Hafif soğuk ve yağmurlu, evde film izleyebilirsiniz!");
                    evFilmEtkinlikleri();
                    break;
                case "karlı":
                    System.out.println("Hafif soğuk ve kar yağışı var, sıcak çikolata içebilirsiniz!");
                    sicakCikolataEtkinlikleri();
                    break;
                case "bulutlu":
                    System.out.println("Hafif soğuk ve bulutlu, alışveriş merkezine gidebilirsiniz!");
                    avmEtkinlikleri();
                    break;
                case "rüzgarlı":
                    System.out.println("Hafif soğuk ve rüzgarlı, evde kitap okuyabilirsiniz!");
                    kitapEtkinlikleri();
                    break;
                default:
                    System.out.println("Geçersiz hava durumu girdiniz.");
            }
        } else {
            switch (havaDurumu) {
                case "güneşli":
                    System.out.println("Çok soğuk ama güneşli, evde kitap okuyabilirsiniz!");
                    kitapEtkinlikleri();
                    break;
                case "yağmurlu":
                    System.out.println("Çok soğuk ve yağmurlu, evde sıcak çay eşliğinde kitap okuyabilirsiniz!");
                    sicakCayEtkinlikleri();
                    break;
                case "karlı":
                    System.out.println("Çok soğuk ve kar yağıyor, evde oyun oynayabilirsiniz!");
                    oyunEtkinlikleri();
                    break;
                case "bulutlu":
                    System.out.println("Çok soğuk ve bulutlu, evde bir şeyler pişirebilirsiniz!");
                    yemekEtkinlikleri();
                    break;
                case "rüzgarlı":
                    System.out.println("Çok soğuk ve rüzgarlı, evde sıcak çikolata içebilirsiniz!");
                    sicakCikolataEtkinlikleri();
                    break;
                default:
                    System.out.println("Geçersiz hava durumu girdiniz.");
            }
        }
    }

    public static void plajEtkinlikleri() {
        System.out.println("Plaj etkinlikleri: yüzme, kumdan kale yapma, plaj voleybolu.");
    }

    public static void muzeeEtkinlikleri() {
        System.out.println("Müze etkinlikleri: sanat galerisi gezisi, bilim müzesi gezisi.");
    }

    public static void dogaYuruyusuEtkinlikleri() {
        System.out.println("Doğa yürüyüşü etkinlikleri: doğa yürüyüşü, kuş gözlemciliği.");
    }

    public static void parkYuruyusuEtkinlikleri() {
        System.out.println("Park yürüyüşü etkinlikleri: koşu, parkta piknik.");
    }

    public static void rüzgarEtkinlikleri() {
        System.out.println("Rüzgar etkinlikleri: uçurtma uçurma, rüzgar sörfü.");
    }

    public static void piknikEtkinlikleri() {
        System.out.println("Piknik etkinlikleri: doğa yürüyüşü, açık havada yemek.");
    }

    public static void sinemaEtkinlikleri() {
        System.out.println("Sinema etkinlikleri: sinemada film izleme, evde film maratonu.");
    }

    public static void kayakEtkinlikleri() {
        System.out.println("Kayak etkinlikleri: kayak, snowboard.");
    }

    public static void bisikletEtkinlikleri() {
        System.out.println("Bisiklet etkinlikleri: bisiklet sürme, parkurda yarış.");
    }

    public static void kutuphaneEtkinlikleri() {
        System.out.println("Kütüphane etkinlikleri: kitap okuma, araştırma yapma.");
    }

    public static void evFilmEtkinlikleri() {
        System.out.println("Evde film etkinlikleri: film izleme, popkorn yapma.");
    }

    public static void sicakCikolataEtkinlikleri() {
        System.out.println("Sıcak çikolata etkinlikleri: sıcak çikolata yapma, arkadaşlarla buluşma.");
    }

    public static void avmEtkinlikleri() {
        System.out.println("AVM etkinlikleri: alışveriş yapma, kafe ziyareti.");
    }

    public static void kitapEtkinlikleri() {
        System.out.println("Kitap etkinlikleri: kitap okuma, kitap kulübüne katılma.");
    }

    public static void sicakCayEtkinlikleri() {
        System.out.println("Sıcak çay etkinlikleri: sıcak çay yapma, kitap okuma.");
    }

    public static void oyunEtkinlikleri() {
        System.out.println("Evde oyun etkinlikleri: masa oyunları, video oyunları.");
    }

    public static void yemekEtkinlikleri() {
        System.out.println("Yemek etkinlikleri: yeni tarifler deneme, pasta yapma.");
    }
}
