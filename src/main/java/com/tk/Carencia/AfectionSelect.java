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


        if(action.equals("kiss")){
            file = new File("Animations/Kiss");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved--;
            com.tk.Carencia.Reactions.Kissus.kiss(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message , 
                imagesSaved), msg.getAuthor().getAsMention());
        }
        else if(action.equals("hug")){
            file = new File("Animations/Hug");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved--;
            com.tk.Carencia.Reactions.Hug.huged(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                imagesSaved), msg.getAuthor().getAsMention());
        }
        else if(action.equals("lick")){
            file = new File("Animations/Lick");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved--;
            com.tk.Carencia.Reactions.Lick.licked(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                imagesSaved), msg.getAuthor().getAsMention());
        }
        else if(action.equals("spank")){
            file = new File("Animations/Spank");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved--;                    
            com.tk.Carencia.Reactions.Spank.spanked(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                imagesSaved), msg.getAuthor().getAsMention());
        }
        else if (action.equals("slap")){
            file = new File("Animations/Slap");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved--;                    
            com.tk.Carencia.Reactions.Slap.slaped(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                imagesSaved), msg.getAuthor().getAsMention());
        }
        else if (action.equals("pat")){
            file = new File("Animations/Pat");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved--;
            com.tk.Carencia.Reactions.Pat.pated(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                imagesSaved), msg.getAuthor().getAsMention());
        }
        else if (action.equals("cry")){
            file = new File("Animations/Cry");
            int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
            imagesSaved --;
            com.tk.Carencia.Reactions.Cry.cry(channel,
                com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                imagesSaved), msg.getAuthor().getAsMention());
        }
    }
}
