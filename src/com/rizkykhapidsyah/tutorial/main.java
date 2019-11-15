package com.rizkykhapidsyah.tutorial;

public class main {
    public static void main(String[] args) {

        int a = 1;
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("While Loop ke-" + a);

            if (a == 10) {
                kondisi = false;
            }

            a++;
        }

        System.out.println("Akhir Program");
    }
}
