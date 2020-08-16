package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var total = scanner.nextInt()
    print("How many round-trip tickets: ")
    var round = scanner.nextInt()
    val tic = ticket(total,round)
    tic.print()
}


class ticket(var total:Int,var round:Int){
    fun print(){
        println("Total tickets: $total \n Round-trip: $round \n Total:" + (1000 * (total-round) + 2000*0.9*round).toInt())
    }
}