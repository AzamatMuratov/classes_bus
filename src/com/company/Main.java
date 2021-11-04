package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bus Bus[] = new bus[3];
        Bus[0] = new bus("Abiwev A.A.", "toyota", 44,1,2014,3300);
        Bus[1] = new bus("James B.A.", "lexus", 32,2,2000,33000);
        Bus[2] = new bus("John N.D.", "BMW", 11,1,2005,28000);

        System.out.print("NOmer marshruta -");
        int buses = sc.nextInt();

        for (int i = 0; i < Bus.length; i++) {
            if(Bus[i].getNum_marsh()==buses)
            System.out.println(Bus[i].toString());
        }
        System.out.print("Srok espluatat - ");
        int srok = sc.nextInt();
        for (int i = 0; i < Bus.length; i++) {
            if(Bus[i].getGod_eksplua()>srok)
            System.out.println(Bus[i].toString());
        }
        System.out.print("nuzhnyi probeg ");
        int probeg = sc.nextInt();
        for (int i = 0; i < Bus.length; i++) {
            if(Bus[i].getProbeg()>probeg)
                System.out.println(Bus[i].toString());
        }
    }
}
