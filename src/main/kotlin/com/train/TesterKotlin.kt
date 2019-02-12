package com.train

import java.util.*

fun main(args: Array<String>) {
    val ticket = 1000
    val roundTrip = 2000*0.9
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets : ")
    var numTickets = scanner.nextInt()
    print("How many round-trip tickets : ")
    var numRoundTrip = scanner.nextInt()
    val tic = KotlinTicket(numTickets, numRoundTrip, ticket, roundTrip)
    tic.Print()
}

class KotlinTicket(var numTickets: Int, var numRoundTrip: Int, var ticket: Int, var roundTrip: Double){
    fun Print(){
        println("Total tickets : " + numTickets)
        println("Round-trip : " + numRoundTrip)
        println("Total : " + ((numTickets-numRoundTrip)*ticket + numRoundTrip*roundTrip))
    }
}