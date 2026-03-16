import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, secim;
        System.out.print("Sayı: ");
        a = scanner.nextInt();
        System.out.print("Sayı: ");
        b = scanner.nextInt();
        System.out.print("Sayı: ");
        c = scanner.nextInt();
        System.out.println("Sıralama seçiminiz: \n1-Küçükten Büyüğe \n2-Büyükten Küçüğe");
        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println(a + ", " + ", " + b + ", " + c + " Küçükten Büyüğe");
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(a + " < " + b + " < " + c);
                    } else {
                        System.out.println(a + " < " + c + " < " + b);
                    }
                } else if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(b + " < " + a + " < " + c);
                    } else {
                        System.out.println(b + " < " + c + " < " + a);
                    }
                } else if (c < a && c < b) {
                    if (a < b) {
                        System.out.println(c + " < " + a + " < " + b);
                    } else {
                        System.out.println(c + " < " + b + " < " + a);
                    }
                }
                break;
            case 2:
                System.out.println(a + ", " + ", " + b + ", " + c + " Büyükten Küçüğe");
                if (a > b && a > c){
                    if (b > c){
                        System.out.println(a + " > " + b + " > " + c);
                    }
                    else {
                        System.out.println(a + " > " + c + " > " + b);
                    }
                }
                else if (b > a && b > c) {
                    if (a > c) {
                        System.out.println(b + " > " + a + " > " + c);
                    } else {
                        System.out.println(b + " > " + c + " > " + a);
                    }
                }
                else if (c > a && c > b) {
                    if (a > b) {
                        System.out.println(c + " > " + a + " > " + b);
                    } else {
                        System.out.println(c + " > " + b + " > " + a);
            }
        }
            default:
                System.out.println("Lütfen seçimi doğru giriniz.");
        }
    }
}
