package com.designpattern.main;

import com.designpattern.encapsulation.Account;

public class App {
    public static void main(String[] args) {
        Account acct = new Account();

        acct.setBalance(100.25f);

        System.out.println("Ballance: " + + acct.getBalance());

        Account arr[] = new Account[2];
    }
}
