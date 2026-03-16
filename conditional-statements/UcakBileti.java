import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mesafe, yas, ucusTipi;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        mesafe = scanner.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz: (1 => Tek Yön, 2 => Çift Yön)");
        ucusTipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (ucusTipi != 1 && ucusTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double normalTutar = mesafe * 0.10;
        double yasIndirimiOrani = 0;

        if (yas < 12) {
            yasIndirimiOrani = 0.50;
        } else if (yas <= 24) {
            yasIndirimiOrani = 0.10;
        } else if (yas > 65) {
            yasIndirimiOrani = 0.30;
        }
        double yasIndirimliTutar = normalTutar * (1 - yasIndirimiOrani);

        double toplamTutar;

        if (ucusTipi == 2) {
            double gidisDonusIndirimli = yasIndirimliTutar * (1 - 0.20);
            toplamTutar = gidisDonusIndirimli * 2;
        } else {
            toplamTutar = yasIndirimliTutar;
        }

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

    }
}

