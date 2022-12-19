import java.util.Scanner;

public class GradeCalculation {
    final Scanner scanner = new Scanner(System.in);
    public void calculation() {
        boolean loop = true;
        double average;
        System.out.println("*****************NOT HESAPLAMA******************\n\n\n\n");
        while (loop) {
            try {
                System.out.print("1.Vize notu : ");
                double midTerm1 = scanner.nextDouble();
                System.out.print("2.Vize notu : ");
                double midTerm2 = scanner.nextDouble();
                System.out.print("Final notu : ");
                double finalEx = scanner.nextDouble();
                average = (0.3*(midTerm1+midTerm2))+(finalEx*0.4);
                System.out.println("Not ortalamanız : " + average);
                if (average>=90) {
                    System.out.println("Notunuz : AA");
                    loop = false;
                } else if (average>=85) {
                    System.out.println("Notunuz : BA");
                    loop = false;
                } else if (average>=80) {
                    System.out.println("Notunuz : BB");
                    loop = false;
                } else if (average>=70) {
                    System.out.println("Notunuz : CB");
                    loop = false;
                } else if (average>=60) {
                    System.out.println("Notunuz : CC");
                    loop = false;
                } else if (average>=55) {
                    System.out.println("Notunuz : DC");
                    loop = false;
                } else if (average>=50) {
                    System.out.println("Notunuz : DD");
                    loop = false;
                } else {
                    System.out.println("Notunuz : FF");
                    loop = false;
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Lütfen notlarınızı tam sayı şeklinde giriniz");
            }
        }
    }
}
