import java.util.Scanner;

public class UcDortBolme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        for(int i=0; i<=sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                sayac++;
            }
        }
        if (sayac != 0){
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4 Bölünen Sayıların Ortalaması: " + ortalama);
        }
        else {
            System.out.println("Uygun sayılar bulunamadı.");
        }
    }
}
