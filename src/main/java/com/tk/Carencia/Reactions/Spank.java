package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Spank extends DiscordSendMessage{

    public static void spanked(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Spank/";
        String afection = "Spank, Spank";

        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Spanked", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);
    }
    
}
