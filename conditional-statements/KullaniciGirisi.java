import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, password, select, newPassword;

        System.out.print("Kullanıcı Adınız: ");
        userName = scanner.nextLine();
        System.out.print("Şifreniz: ");
        password = scanner.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı.");
        }
        else if(userName.equals("patika") && !password.equals("java123")){
            System.out.print("Şifre yanlış şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
            select = scanner.nextLine();

            if(select.equalsIgnoreCase("evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scanner.nextLine();

                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else{
                System.out.println("Giriş sonlandırıldı.");
            }
        }
        else {
            System.out.println("Giriş başarısız.");
        }
    }
}
