package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int round = 0;
        while (total != -1) {
            System.out.println("Please enter number of tickets: ");
            total = scanner.nextInt();
            if (total == -1) break;
            System.out.println("How many round-trip tickets: ");
            round = scanner.nextInt();
            if (round == -1) break;
            Ticket tic = new Ticket(total, round);
            tic.print();
        }
    }
}
