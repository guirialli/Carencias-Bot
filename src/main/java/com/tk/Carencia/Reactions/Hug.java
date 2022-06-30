package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Hug extends DiscordSendMessage {

    public static void huged( MessageChannel channel, String dedicate, int number, String authorName ) throws IllegalArgumentException{
        String path="Animations/Hug/";
        String afection="Hug";
        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Huged", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);

    }
}
