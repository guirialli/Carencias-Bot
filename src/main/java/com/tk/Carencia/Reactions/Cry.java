package com.tk.Carencia.Reactions;

import com.tk.Discord.DiscordSendMessage;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Cry extends DiscordSendMessage {

    public static void cry(MessageChannel channel, String dedicate, int number, String authorName ){
        String path = "Animations/Cry/";
        String afection="Cry, Cry with a baby";
        com.tk.Discord.DiscordSendMessage.sendMessage(
            com.tk.Discord.DiscordSendMessage.mountMessage("Cryng because", 
            dedicate, authorName, number), 
            com.tk.Discord.DiscordSendMessage.animateFile(number, path), channel, afection);
    }
}
