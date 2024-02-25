import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);

        int n = 0, toplam = 0;


        System.out.println("Lütfen bir sayı girin = ");

        while (true) {
            int sayi = ka.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
                System.out.print(toplam);
            }

            // Kullanıcı tek bir sayı girdiğinde döngüyü sonlandır
            if (sayi % 2 != 0) {
                break;
            }
        }
    }}