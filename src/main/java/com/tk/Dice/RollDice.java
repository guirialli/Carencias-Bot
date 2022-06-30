package com.tk.Dice;

import net.dv8tion.jda.api.entities.MessageChannel;

public class RollDice extends com.tk.Discord.DiscordSendMessage {


    public static  void roll(String msg, MessageChannel channel ){
        int  dices = com.tk.Algoritimo.DicesCut.cutDice(msg);
        int rolls = com.tk.Algoritimo.DicesCut.cutRoll(msg);
        int somaRoll=0, resultPass=0;
        int roll;
        String commentString, titleString = "**ROLLS:** ";
        String[] splint = msg.split(" ");

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
                somaRoll += roll;
                if(i+1 < dices)
                    commentString += roll + ",";
                else
                    commentString += roll + "]";
            }
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
                if(i+1 < dices)
                    commentString += roll + ",";
                else
                    commentString += roll + "]";
            }
            commentString += " ----> " + "(" + Integer.toString(somaRoll)  + ")";
            titleString += "**" + resultPass + " hits**";
            com.tk.Discord.DiscordSendMessage.sendMessage(commentString, titleString, channel);
        }
        else{
            commentString = "[ ";


            for (int i = 0; i < dices; i++) {
                roll = com.tk.Algoritimo.AleatoryNum.genNumberInt(rolls);
                somaRoll += roll;
                if(i+1 < dices)
                    commentString += roll + ",";
                else
                    commentString += roll + "]";
            }
            commentString += " ----> " + "(" + Integer.toString(somaRoll)  + ")";
            com.tk.Discord.DiscordSendMessage.sendMessage(commentString,titleString, channel);
        }
    }

}
