package com.train;

public class Ticket {
    int total;
    int round;
    public Ticket(int total,int round){
        this.total = total;
        this.round = round;
    }
    public void print(){
        int all = (int) (1000 * (total-round) + 2000*0.9*round);
        System.out.println("Total tickets: "+total + "\n" + "Round-trip:" + round + "\n" + "Total:" + all + "\n") ;
    }

}
