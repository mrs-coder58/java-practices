import java.util.Scanner;

public class ForDongusuUsluSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , k , total = 1;

        System.out.print("Üssü alınacak sayı: ");
        n = scanner.nextInt();

        System.out.print("Üs olacak sayı: ");
        k = scanner.nextInt();

        for (int i=1;i<=k;i++){
            total *= n;
        }

        System.out.println("Sonuç: " + total);
    }
}
