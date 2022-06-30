package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Hug extends ReactingServices {

    public static void huged( MessageChannel channel, String dedicate, int number, String authorName ) throws IllegalArgumentException{
        String path="Animations/Hug/";
        String afection="Hug";
        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Huged", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);

    }
}
