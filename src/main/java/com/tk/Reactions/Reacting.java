package com.tk.Reactions;

import java.io.File;

import net.dv8tion.jda.api.entities.MessageChannel;


public class Reacting {
    
    protected static String mountMessage(String  action, String dedicate, String authorName, int number ){

        StringBuilder builder = new StringBuilder();
        builder.append(authorName);
        builder.append(" " + action +" ");
        builder.append("@" + dedicate + " ");
        builder.append("#"+number);
        return builder.toString();
    }

    protected static File animateFile(int number, String caminho){
        StringBuilder builder = new StringBuilder();
        builder.append(caminho + Integer.toString(number) +".gif");
        return new File(builder.toString());        
    }

    protected static void sendMessage(String mountMessageString, File animateFile, MessageChannel channel){
        channel.sendMessage(mountMessageString).addFile(animateFile, "image.gif").queue();;
    } 
}
