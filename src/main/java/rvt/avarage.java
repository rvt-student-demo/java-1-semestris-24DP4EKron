package rvt;
import java.util.Scanner;

public class avarage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        System.out.println("Videjais skaitlis ir" +
            (first + second + third) / 3);

    }
}