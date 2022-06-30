package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Pat extends DiscordSendMessage {
    
    public static void  pated(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Pat/";
        String afection = "Pats";

        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Pats", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);
    }
}
