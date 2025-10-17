package rvt;
import java.util.Scanner;


public class giftTax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double money = Double.valueOf(scanner.nextLine());
        if (money <= 4999) {
            System.out.println("No tax!");
        } else if (money <= 24999) {
            double tax = 100 + (money - 5000) * 0.08;
            System.out.println(tax);
        } else if (money <= 54999) {
            double tax = 1700 + (money - 25000) * 0.1;
            System.out.println(tax);
        } else if (money <= 199999) {
            double tax = 4700 + (money - 55000) * 0.12;
            System.out.println(tax);
        } else if (money <= 999999) {
            double tax = 22100 + (money - 200000) * 0.15;
            System.out.println(tax);
        } else if (money >= 1000000) {
            double tax = 142100 + (money - 1000000) * 0.17;
            System.out.println(tax);
        }
    }
}