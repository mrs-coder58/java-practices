import java.util.Scanner;

public class DordeBolunenSayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, toplam=0;

        do {
            System.out.print("Sayı giriniz: ");
            n = scanner.nextInt();

            if(n % 4 == 0){
                toplam += n;
            }
        }
        while (n % 2 == 0);
            System.out.println("Toplam: " + toplam);
    }
}
