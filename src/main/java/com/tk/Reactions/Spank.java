package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Spank extends ReactingServices{

    public static void spanked(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "Animations/Spank/";
        String afection = "Spank, Spank";

        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Spanked", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);
    }
    
}
