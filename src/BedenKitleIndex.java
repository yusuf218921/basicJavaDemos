import java.util.Scanner;

public class BedenKitleIndex {
    public void bedenKitleIndexHesaplama() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilo : ");
        int kilo = scanner.nextInt();
        System.out.print("Boy : ");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);

        if (bki < 18.4) {
            System.out.println("Zayıf");
        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        } else if (bki >= 25 && bki < 30) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}
