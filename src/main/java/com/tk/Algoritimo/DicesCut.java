package com.tk.Algoritimo;

public class DicesCut {
    public static int cutDice(String message){
        String msg = com.tk.Algoritimo.ServicesOnMsg.shorC(message, 1, message.length());
        String[] split = msg.split(" ");
        int dices = Integer.parseInt(com.tk.Algoritimo.ServicesOnMsg.shorC(split[0], split[0].indexOf("d"))); // numbers = shorC(split[0], split[0].indexOf("d"), split[0].length()) ;
        return dices;
    }

    public static int cutRoll
    (String message){
        String msg = com.tk.Algoritimo.ServicesOnMsg.shorC(message, 1, message.length());
        String[] split = msg.split(" ");
        int   numbers = Integer.parseInt(com.tk.Algoritimo.ServicesOnMsg.shorC(split[0], split[0].indexOf("d")+1, split[0].length()));
        return numbers;
    }
}
