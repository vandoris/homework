package com.train;

import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets : ");
        Scanner scanner = new Scanner(System.in);
        int numTickts = scanner.nextInt();
        System.out.print("How many round-trip tickets : ");
        int numRoundTrip = scanner.nextInt();

        Ticket ticket = new Ticket(numTickts, numRoundTrip);
        ticket.Print();
    }
}