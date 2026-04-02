import java.util.Scanner;

public class DortBesKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Sayı: ");
        number = scanner.nextInt();

        System.out.println("4 ve 5'in Ortak Kuvvetleri: ");
        for (int i=1;i<=number;i++){
            if (i%4==0 && i%5==0){
                System.out.println(i);
            }
        }
        //İKİNCİ ÇÖZÜM
        System.out.println("4'ün Kuvvetleri:");
        for (int i=1;i<=number;i++){
            if (i%4==0){
                System.out.println(i);
            }
        }

        System.out.println("5'in Kuvvetleri: ");
        for (int i=1;i<=number;i++){
            if (i%5==0){
                System.out.println(i);
            }
        }

    }
}
