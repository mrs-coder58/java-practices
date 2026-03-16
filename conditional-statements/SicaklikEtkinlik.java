import java.util.Scanner;

public class SicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;
        System.out.print("Sıcaklık: ");
        heat = scanner.nextInt();

        int durum = -1;

        if(heat < 5){
            durum = 0;
        }
        else if(heat >= 5 && heat < 15){
            durum = 1;
        }
        else if(heat >= 15 && heat < 25){
            durum = 2;
        }
        else if(heat >= 25){
            durum = 3;
        }

        switch (durum) {
            case 0:
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case 1:
                System.out.println("Sinemaya gidebilirsiniz.");
                break;
            case 2:
                System.out.println("Pikniğe gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Yüzebilirsiniz.");
                break;
        }
    }
}
