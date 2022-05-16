package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Lick extends ReactingServices{
    
    public static  void licked(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Lick/";
        String afection = "Lick, Lick";

        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Licked", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);
    }
}
