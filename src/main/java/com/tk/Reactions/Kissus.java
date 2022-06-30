package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;


public class Kissus extends ReactingServices{
    public static void kiss( MessageChannel channel, String dedicate, int number, String authorName ) throws IllegalArgumentException{
        String path = "Animations/Kiss/";
        String afection = "Kissus";

        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Kissed", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);
    }
    
}
