package com.tk.Reactions;

import java.io.File;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.EmbedBuilder;
import java.awt.Color;



public abstract class Reacting {

    
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

    protected static void sendMessage(String mountMessageString, File animateFile, MessageChannel channel) {
        EmbedBuilder eb = new EmbedBuilder();

        eb.setTitle("❤Afection!❤");
        eb.setColor(new Color(330202));
        eb.setDescription(mountMessageString);
        channel.sendFile(animateFile).setEmbeds(eb.build()).queue();
    }
}
