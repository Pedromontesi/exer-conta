package Bank;

import Entities.Info;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Info info;

        System.out.print("Set your number account: ");
        int accountNumber = sc.nextInt();
        System.out.print("Set your titular name: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.print("do you want to deposit into your account?(y/n)");
        char response = sc.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextInt();
            info = new Info(accountNumber, accountName, initialDeposit);

        } else {
            info = new Info(accountNumber, accountName);

        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(info);

        System.out.println();
        System.out.print("Enter a deposit value");
        double depositValue = sc.nextDouble();
        info.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(info);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double withdrawValue = sc.nextDouble();
        info.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(info);

        sc.close();
    }
}
