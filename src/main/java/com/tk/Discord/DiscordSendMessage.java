package com.tk.Discord;

import java.io.File;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.EmbedBuilder;
import java.awt.Color;



public abstract class DiscordSendMessage{

    public static void sendGif(String mountMessageString, String emoji ,File animateFile, MessageChannel channel, String afection) {
        EmbedBuilder eb = new EmbedBuilder();  
        eb.setTitle("❤"+afection+"!❤");
        eb.setColor(new Color(075010130));
        eb.setDescription(mountMessageString);
        eb.setImage("attachment://Image.gif");
        channel.sendFile(animateFile, "Image.gif").setEmbeds(eb.build()).queue(message ->{
            message.addReaction(emoji).queue();
        });
    }

    public static void sendGif(String mountMessageString, File animateFile, MessageChannel channel, String afection) {
        EmbedBuilder eb = new EmbedBuilder();  
        eb.setTitle("❤"+afection+"!❤");
        eb.setColor(new Color(075010130));
        eb.setDescription(mountMessageString);
        eb.setImage("attachment://Image.gif");
        channel.sendFile(animateFile, "Image.gif").setEmbeds(eb.build()).queue();
    }

    public static void sendMessage(String message, MessageChannel channel){
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(new Color(075010130));
        eb.setDescription(message);
        channel.sendMessageEmbeds(eb.build()).queue();
    }

    public static void sendMessage(String message, String title,MessageChannel channel){
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(new Color(075010130));
        eb.setTitle(title);
        eb.setDescription(message);
        channel.sendMessageEmbeds(eb.build()).queue();
    }
}
