import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , r;
        long nFactor = 1;
        long rFactor = 1;
        long farkFactor = 1;
        long total = 1;

        System.out.print("Eleman sayısı: ");
        n = scanner.nextInt();

        System.out.print("Grup sayısı: ");
        r = scanner.nextInt();

        for (int i=1;i<=n;i++){
            nFactor = nFactor * i;
        }
        for (int j=1;j<=r;j++){
            rFactor *= j;
        }
        int fark = (n - r);
        for (int k=1;k<=fark;k++){
            farkFactor = farkFactor * k;
        }
        total = nFactor / (rFactor) * (farkFactor);
        System.out.println("Kombinasyon Sonucu: " + total);
    }
}
