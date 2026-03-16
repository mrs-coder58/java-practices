import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;
        int toplam = 0;
        int sayac = 0;

        System.out.print("Matematik notunuz: ");
        mat = scanner.nextInt();
        if(mat >= 0 && mat <= 100){
            toplam += mat;
            sayac++;
        }
        else {
            System.out.println("Not geçersiz ortalamaya katılmayacktır.");
        }

        System.out.print("Fizik notunuz: ");
        fizik = scanner.nextInt();
        if(fizik >= 0 && fizik <= 100){
            toplam += fizik;
            sayac++;
        }
        else {
            System.out.println("Not geçersiz ortalamaya katılmayacaktır.");
        }

        System.out.print("Türkçe notunuz: ");
        turkce = scanner.nextInt();
        if(turkce >= 0 && turkce <= 100){
            toplam += turkce;
            sayac++;
        }
        else {
            System.out.println("Not geçersiz ortalamaya katılmayacaktır.");
        }

        System.out.print("Kimya notunuz: ");
        kimya = scanner.nextInt();
        if(kimya >= 0 && kimya <= 100){
            toplam += kimya;
            sayac++;
        }
        else {
            System.out.println("Not geçersiz ortalamaya katılmayacaktır.");
        }

        System.out.print("Müzik notunuz: ");
        muzik = scanner.nextInt();
        if(muzik >= 0 && muzik <= 100){
            toplam += muzik;
            sayac++;
        }
        else{
            System.out.println("Not geçersiz ortalamaya katılmayacaktır.");
        }

        if(sayac == 0){
            System.out.println("Girilen notlar geçersiz, ortalama hesaplanamadı.");
        }
        else {
            double ortalama = (double) toplam / sayac;
            System.out.println("Ortalamanız: " + ortalama);

            if(ortalama >= 55){
                System.out.println("Tebrikler, sınıfı geçtiniz.");
            }
            else {
                System.out.println("Maalesef, sınıfta kaldınız.");
            }
        }

    }
}
