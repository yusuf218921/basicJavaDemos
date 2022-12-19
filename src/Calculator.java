import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void calculator() {
        int x1, x2;
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("toplama\nçıkarma\nbölme\nçarpma\nlütfen yukarıdaki işlemlerden birini giriniz: ");
                while (loop) {
                    switch (scanner.next()) {
                        case "toplama":
                            while (loop) {
                                try {
                                    System.out.println("********Toplama işlemi*********\n");
                                    System.out.print("Birinci sayı(Z) : ");
                                    x1 = scanner.nextInt();
                                    System.out.print("İkinci sayı(Z) : ");
                                    x2 = scanner.nextInt();
                                    System.out.println("Cevap = " + (x1 + x2));
                                    loop = false;
                                    break;
                                } catch (Exception e) {
                                    scanner.nextLine();
                                    System.out.println("Lütfen toplamak istediğiniz sayıları tam sayı şeklinde giriniz");
                                }
                            } break;
                        case "çıkarma":
                            while (loop) {
                                try {
                                    System.out.println("********Çıkarma İşlemi*********\n");
                                    System.out.print("Birinci sayı(Z) : ");
                                    x1 = scanner.nextInt();
                                    System.out.print("İkinci sayı(Z) : ");
                                    x2 = scanner.nextInt();
                                    System.out.println("Cevap = " + (x1 - x2));
                                    loop = false;
                                    break;
                                } catch (Exception e) {
                                    scanner.nextLine();
                                    System.out.println("Lütfen çıkarmak istediğiniz sayıları tam sayı şeklinde giriniz");
                                }
                            } break;
                        case "çarpma":
                            while (loop) {
                                try {
                                    System.out.println("********Çarpma işlemi*********\n");
                                    System.out.print("Birinci sayı(Z) : ");
                                    x1 = scanner.nextInt();
                                    System.out.print("İkinci sayı(Z) : ");
                                    x2 = scanner.nextInt();
                                    System.out.println("Cevap = " + (x1 * x2));
                                    loop = false;
                                    break;
                                } catch (Exception e) {
                                    scanner.nextLine();
                                    System.out.println("Lütfen çarpmak istediğiniz sayıları tam sayı şeklinde giriniz");
                                }
                            } break;
                        case "bölme":
                            while (loop) {
                                try {
                                    System.out.println("********Bölme İşlemi*********\n");
                                    System.out.print("Birinci sayı(R) : ");
                                    x1 = scanner.nextInt();
                                    System.out.print("İkinci sayı(R) : ");
                                    x2 = scanner.nextInt();
                                    System.out.println("Cevap = " + ((double)x1 / (double)x2));
                                    loop = false;
                                    break;
                                } catch (Exception e) {
                                    scanner.nextLine();
                                    System.out.println("Lütfen bölmek istediğiniz sayıları tam sayı şeklinde giriniz");
                                }
                            } break;
                        default:
                            System.out.println("Yanlış işlem seçildi lütfen tekrar deneyiniz...");
                            break;
                    }
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Hatalı değer girildi lütfen yapmak istediğiniz işlemi doğru bir şekilde yazınız");
            }
        }
    }
}
