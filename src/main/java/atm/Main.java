package atm;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int amount = sc.nextInt();
            // 20, 10, 5, ....
            // amount % 5 == 0
            // How to receive amount by using the smallest amount of bills

            ATM atm = new ATM();
            atm.process(amount);
        }
    }
}
