import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 400 == 0){
            System.out.println(yil + " bir artık yıldır.");
        }
        else if (yil % 100 == 0){
            System.out.println(yil + " bir artık yıl değildir.");
        }
        else if (yil % 4 == 0){
            System.out.println(yil + " bir artık yıldır.");
        }
        else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
