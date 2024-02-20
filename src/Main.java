import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = input.nextInt();

        String[] cinZodyagi = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };

        int indeks = dogumYili % 12;

        if (indeks >= 0 && indeks < cinZodyagi.length) {
            String zodyakBurcu = cinZodyagi[indeks];
            System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
        } else {
            System.out.println("Geçersiz bir yıl girdiniz.");
        }
    }
}
