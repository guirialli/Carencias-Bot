package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;


public class Kissus extends DiscordSendMessage{
    public static void kiss( MessageChannel channel, String dedicate, int number, String authorName ) throws IllegalArgumentException{
        String path = "Animations/Kiss/";
        String afection = "Kissus";

        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Kissed", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);
    }
    
}
