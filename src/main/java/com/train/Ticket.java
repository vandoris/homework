package com.train;

public class Ticket {
    double ticket = 1000;
    double roundTrip = 2000*0.9;
    int numTickets, numRoundTrip;

    public Ticket(int numTickets, int numRoundTrip){
        this.numTickets = numTickets;
        this.numRoundTrip = numRoundTrip;
    }

    public void Print(){
        System.out.println("Total tickets : " + numTickets);
        System.out.println("Round-trip : " + numRoundTrip);
        System.out.println("Total : " + ((numTickets-numRoundTrip)*ticket + numRoundTrip*roundTrip));
    }

}
