package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Slap extends ReactingServices {
    
    public  static void slaped(MessageChannel channel, String dedicate, int number, String authorName){
        String path = "src/main/java/com/tk/Animations/Slap/";
        String afection = "Slaps, Slaps";

        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Slaped", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);
    }
}
