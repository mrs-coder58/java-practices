import java.util.Scanner;

public class UcgenOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        //BU DÖNGÜ ŞEKLİN KAÇ SATIRDAN OLUŞACAĞINI BELİRLER
        for (int i=0;i<=n;i++){
            //BİRİNCİ İÇ DÖNGÜ BOŞLUK SAYISINI BELİRLER
            for (int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            //İKİNCİ İÇ DÖNGÜ YILDIZ SAYISINI BELİRLER
            for (int k=1;k<=(2 * i + 1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=(n-1);i>=0;i--){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2 * i + 1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
