import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km;
        System.out.print("Lütfen KM cinsinden gidilecek yolu giriniz: ");
        km = scanner.nextInt();
        double taksimetreTutari = 10 + (km * 2.20);
        double odenecekTutar = taksimetreTutari < 20 ? 20.0 : taksimetreTutari;
        System.out.println("Ödenecek tutar: " + odenecekTutar);
    }
}
