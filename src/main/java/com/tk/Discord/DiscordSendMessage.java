package com.tk.Discord;

import java.io.File;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.EmbedBuilder;
import java.awt.Color;



public abstract class DiscordSendMessage{

    
    protected static String mountMessage(String  action, String dedicate, String authorName, int number ){

        StringBuilder builder = new StringBuilder();
        builder.append(authorName);
        builder.append(" **" + action +"** ");
        if(!dedicate.isEmpty())
        builder.append("<@" + dedicate + "> ");
        builder.append("**#"+number + "**");
        return builder.toString();
    }

    protected static File animateFile(int number, String caminho) throws IllegalArgumentException{
        StringBuilder builder = new StringBuilder();
        builder.append(caminho + Integer.toString(number) +".gif");
        return new File(builder.toString());    
    }

    protected static void sendMessage(String mountMessageString, File animateFile, MessageChannel channel, String afection) {
        EmbedBuilder eb = new EmbedBuilder();  
        eb.setTitle("❤"+afection+"!❤");
        eb.setColor(new Color(075010130));
        eb.setDescription(mountMessageString);
        eb.setImage("attachment://Image.gif");
        channel.sendFile(animateFile, "Image.gif").setEmbeds(eb.build()).queue();
    }

    protected static void sendMessage(String message, MessageChannel channel){
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(new Color(075010130));
        eb.setDescription(message);
        channel.sendMessageEmbeds(eb.build()).queue();
    }

    protected static void sendMessage(String message, String title,MessageChannel channel){
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(new Color(075010130));
        eb.setTitle(title);
        eb.setDescription(message);
        channel.sendMessageEmbeds(eb.build()).queue();
    }
}
