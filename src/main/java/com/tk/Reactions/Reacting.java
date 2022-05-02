package com.tk.Reactions;

import java.io.File;

import net.dv8tion.jda.api.entities.MessageChannel;


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

    protected static File animateFile(int number, String caminho){
        try {
            StringBuilder builder = new StringBuilder();
            builder.append(caminho + Integer.toString(number) +".gif");
            return new File(builder.toString());   
        } catch (IllegalArgumentException  e) {
            e.printStackTrace();
            System.out.println("File not found or unknown error. check if you have correctly typed imagesSaved equal to the number of gifs inside in folder.");
            return new File("src/main/java/com/tk/Reactions/Error/error.jpg");
        }
     
    }

    protected static void sendMessage(String mountMessageString, File animateFile, MessageChannel channel){
        channel.sendMessage(mountMessageString).addFile(animateFile, "image.gif").queue();
    } 
}
