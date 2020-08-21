package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var total = 0
    var round = 0
    while (total != -1) {
        print("Please enter number of tickets: ")
        total = scanner.nextInt()
        if (total == -1) break
        print("How many round-trip tickets: ")
        round = scanner.nextInt()
        if (round == -1) break
        val tic = tic(total, round)
        tic.print()
    }
}


class tic(var total:Int,var round:Int){
    fun print(){
        var all = (1000 * (total-round) + 2000*0.9*round).toInt()
        println("Total tickets: $total \nRound-trip: $round \nTotal: $all\n")
    }
}