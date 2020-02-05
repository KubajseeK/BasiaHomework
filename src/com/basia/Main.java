package com.basia;

public class Main {

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        System.out.println(encrypt.getRandomPassword(10, false));
    }
}
