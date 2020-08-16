package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var total = scanner.nextInt()
    print("How many round-trip tickets: ")
    var round = scanner.nextInt()
    val tic = tic(total,round)
    tic.print()
}


class tic(var total:Int,var round:Int){
    fun print(){
        var all = (1000 * (total-round) + 2000*0.9*round).toInt()
        println("Total tickets: $total \nRound-trip: $round \nTotal: $all")
    }
}