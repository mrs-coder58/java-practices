import java.util.Scanner;

public class VkiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double boy, kilo;
        System.out.print("Lütfen boyunuzu (metre) cinsinde giriniz: ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        double vki = (kilo / (boy * boy));
        System.out.println("Vki: " + vki);

    }
}
