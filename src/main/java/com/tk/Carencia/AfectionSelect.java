package com.tk.Carencia;

import java.io.File;
import java.util.Arrays;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class AfectionSelect {
    

    public  static void selector(MessageReceivedEvent event, String message, Message  msg){
        MessageChannel channel = event.getChannel();
        File file;
        String action = com.tk.Algoritimo.ServicesOnMsg.cutAction(message + " ");
        file = new File("Animations/" + action);

        if(file.exists()){
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            sendAfect(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                msg.getAuthor().getAsMention(), action,
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message , 
                imagesSaved));
        }
       
    }

    private static void sendAfect(MessageChannel channel, String dedicate, String authorName,String afection,  int number){
        String path = "Animations/" + afection + "/";
        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordMountMenssage.mountMessage(afection, 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordFile.animateFile(number, path), channel, (afection + " " + afection));
    }
}
