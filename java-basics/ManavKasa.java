import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;

        System.out.print("Armut kaç kilo ? ");
        armut = scanner.nextDouble();
        System.out.print("Elma kaç kilo ? ");
        elma = scanner.nextDouble();
        System.out.print("Domates kaç kilo ? ");
        domates = scanner.nextDouble();
        System.out.print("Muz kaç kilo ? ");
        muz = scanner.nextDouble();
        System.out.print("Patlıcan kaç kilo ? ");
        patlican = scanner.nextDouble();

        double odenecekTutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) +
                (muz * 0.95) + (patlican * 5.00);

        System.out.println("Manava ödenecek tutar: " + odenecekTutar);

    }
}
