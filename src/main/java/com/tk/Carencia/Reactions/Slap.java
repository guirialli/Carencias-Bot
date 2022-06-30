package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Slap extends DiscordSendMessage {
    
    public  static void slaped(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Slap/";
        String afection = "Slaps, Slaps";

        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Slaped", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);
    }
}
