import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin kenar uzunluğunu giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("Üçgenin kenar uzunluğunu giriniz: ");
        double b = scanner.nextDouble();
        System.out.print("Üçgenin kenar uzunluğunu giriniz: ");
        double c = scanner.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("Üçgenin Alanı: " + alan);
    }
}
