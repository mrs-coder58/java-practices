import java.util.Scanner;

public class BasamakSayilariToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı: ");
        int sayi = scanner.nextInt();
        int geciciSayi = sayi;
        int basamakDegeri;
        int toplam = 0;

        //FOR ÇÖZÜMÜ
        for (int i=sayi;i>=0;i--){
            basamakDegeri = geciciSayi % 10;
            toplam += basamakDegeri;
            geciciSayi /= 10;
        }

        System.out.println("Sonuç: " + toplam);
    }
}
