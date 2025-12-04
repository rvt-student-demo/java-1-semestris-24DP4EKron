package rvt;
import java.util.Scanner;
public class skaitluanalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int skaits = 0;
        int summa = 0;
        int lielakais = Integer.MIN_VALUE;
        int mazākais = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
            int skaitlis = scanner.nextInt();

            if (skaitlis <= 0) {
                break;
            }

            skaits++;
            summa += skaitlis;

            if (skaitlis > lielakais) {
                lielakais = skaitlis;
            }

            if (skaitlis < mazākais) {
                mazākais = skaitlis;
            }
        }

        if (skaits > 0) {
            double videja = (double) summa / skaits;

            System.out.println("\nIevadito skaitlu skaits: " + skaits);
            System.out.println("Skaitlu summa: " + summa);
            System.out.println("Videja vertiba: " + videja);
            System.out.println("Lielakais skaitlis: " + lielakais);
            System.out.println("Mazakais skaitlis: " + mazākais);
        } else {
            System.out.println("Netika ievadīts neviens pozitīvs skaitlis.");
        }

        scanner.close();
    }
}