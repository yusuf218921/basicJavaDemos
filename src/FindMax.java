import java.util.Scanner;

public class FindMax {
    public void max() {
        Scanner scanner = new Scanner(System.in);
        int x1 = 0, x2 = 0, x3 = 0;
        boolean loop = true;
        while (loop)
            try {
                System.out.print("Lütfen girmek istediğiniz 3 sayiyi arada boşluk bırakarak yazınız : ");
                x1 = scanner.nextInt();
                x2 = scanner.nextInt();
                x3 = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Yanlış tip girdisi oluştu, lütfen sadece tam sayı girerek tekrar deneyiniz");
            }
        if (x1 >= x2) {
            if (x1 >= x3) {
                System.out.println("Büyük sayi : " + x1);
            } else {
                System.out.println("Büyük sayi : " + x3);
            }
        } else {
            if (x2 >= x3) {
                System.out.println("Büyük sayi : " + x2);
            } else {
                System.out.println("Büyük sayi : " + x3);
            }
        }
    }
}
