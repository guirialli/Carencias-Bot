package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Lick extends DiscordSendMessage{
    
    public static  void licked(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Lick/";
        String afection = "Lick, Lick";

        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Licked", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);
    }
}
