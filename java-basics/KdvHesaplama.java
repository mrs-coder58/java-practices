import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tutar, kdvTutar, kdvliTutar;

        System.out.print("Ücret tutarını giriniz: ");
        tutar = scanner.nextDouble();
        double kdvOran = tutar <= 1000 ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);
    }
}
