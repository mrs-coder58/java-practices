import java.util.Scanner;

public class DaireDilimAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        double pi = 3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.print("Derece: ");
        double derece = scanner.nextInt();
        double dilimAlan = (pi * (r*r) *derece) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dilim Alan: " + dilimAlan);

    }
}
