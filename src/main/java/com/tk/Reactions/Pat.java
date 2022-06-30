package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Pat extends ReactingServices {
    
    public static void  pated(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Pat/";
        String afection = "Pats";

        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Pats", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);
    }
}
