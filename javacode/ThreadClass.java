package javacode;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 02/02/24
 * Time : 10:11 am
 * Project_Name : java_core
 */
final class MainAccount {
    private float Balance;

    MainAccount(float Balance) {
        this.Balance = Balance;
    }

    public void withdraw(float amt, String name) {
        Balance = Balance - amt;
        System.out.println("dear " + name + " withdraw money : " + amt);
        System.out.println(" dear " + name + " current Balance : " + Balance);
    }

    public boolean isSufficientBalance(float withdrawAmt, String name) {

        System.out.println("check the id name :" + name);
        return withdrawAmt < Balance;
    }

}

class Customer extends Thread {
    private final MainAccount account;
    private final String name;

    public Customer(MainAccount ob, String name) {
        account = ob;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (account) {

        System.out.println("enter by user id : " + name);
        Scanner sc = new Scanner(System.in);

        float withdraw_amt = sc.nextFloat();
            if (account.isSufficientBalance(withdraw_amt, name)) {
                try {
                    sleep(323);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("dear: " + name);
                account.withdraw(withdraw_amt, name);
            } else {
                System.out.println("No sufficient Balance :-");
            }
        }

    }
}

public class ThreadClass {

    public static void main(String[] args) {
        MainAccount ob = new MainAccount(100.34f);
        Customer c2 = new Customer(ob, "mohd shakir");
        Customer c1 = new Customer(ob, "mohd salman");
        c1.start();
        c2.start();
    }

}




    