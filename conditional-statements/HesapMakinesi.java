import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,select;
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız tekrar deneyiniz.");
        }
    }
}
