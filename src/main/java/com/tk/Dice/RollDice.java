package com.tk.Dice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import net.dv8tion.jda.api.entities.MessageChannel;

public class RollDice extends com.tk.Discord.DiscordSendMessage {


    public static  void roll(String msg, MessageChannel channel ){
        int  dices = com.tk.Algoritimo.DicesCut.cutDice(msg);
        int rolls = com.tk.Algoritimo.DicesCut.cutRoll(msg);
        int somaRoll=0, resultPass=0;
        int roll;
        String commentString, titleString = "**ROLLS:** ";
        String[] splint = msg.split(" ");
        List<Integer> rollList = new ArrayList<>();

        Comparator<Integer> compDice = (d1,d2) -> d2.compareTo(d1);

        if(msg.indexOf("!")!=-1 && msg.indexOf("+")==-1){
            String[] div = splint[1].split("!");
            int expected= Integer.parseInt(div[0]),  negative = Integer.parseInt(div[1]);
            commentString = "[ ";


            for (int i = 0; i < dices; i++) {
                roll = com.tk.Algoritimo.AleatoryNum.genNumberInt(rolls);
                if(roll >= expected){
                    resultPass++;
                }
                else if(roll == negative){
                    resultPass --;
                }
                rollList.add(roll);
                somaRoll += roll;
            }
            rollList.sort(compDice);
            for(int x : rollList)
                commentString+=x + ",";
            commentString += "]";
            commentString += " ----> " + "(" + Integer.toString(somaRoll)  + ")";
            titleString += "**" + resultPass + " hits**";
            com.tk.Discord.DiscordSendMessage.sendMessage(commentString, titleString, channel);
        }
        else if(msg.indexOf("+")!=-1 && msg.indexOf("!")==-1){
            int expected= Integer.parseInt(com.tk.Algoritimo.ServicesOnMsg.shorC(splint[1], splint[1].length()-1));
            commentString = "[ ";


            for (int i = 0; i < dices; i++) {
                roll = com.tk.Algoritimo.AleatoryNum.genNumberInt(rolls);
                if(roll >= expected){
                    resultPass++;
                }
                somaRoll += roll;
                rollList.add(roll);
            }
            rollList.sort(compDice);
            for(int x : rollList)
                commentString+=x + ",";
            commentString += "]";
            commentString += " ----> " + "(" + Integer.toString(somaRoll)  + ")";
            titleString += "**" + resultPass + " hits**";
            com.tk.Discord.DiscordSendMessage.sendMessage(commentString, titleString, channel);
        }
        else{
            commentString = "[ ";


            for (int i = 0; i < dices; i++) {
                roll = com.tk.Algoritimo.AleatoryNum.genNumberInt(rolls);
                somaRoll += roll;
                rollList.add(roll);
            }

            rollList.sort(compDice);
            for(int x : rollList)
                commentString+=x + ",";
            commentString += "]";
            commentString += " ----> " + "(" + Integer.toString(somaRoll)  + ")";
            com.tk.Discord.DiscordSendMessage.sendMessage(commentString,titleString, channel);
        }
    }

}
