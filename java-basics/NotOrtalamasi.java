import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notu: ");
        mat = scanner.nextInt();

        System.out.print("\nFizik notu: ");
        fizik = scanner.nextInt();

        System.out.print("\nKimya notu: ");
        kimya = scanner.nextInt();

        System.out.print("\nTürkçe notu: ");
        turkce = scanner.nextInt();

        System.out.print("\nTarih notu: ");
        tarih = scanner.nextInt();

        System.out.print("\nMüzik notu: ");
        muzik = scanner.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Not ortalaması: " + ortalama);
        System.out.print("Sonuç: " + sonuc);


    }
}
