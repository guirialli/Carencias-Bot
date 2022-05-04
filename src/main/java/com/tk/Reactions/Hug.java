package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Hug extends Reacting {

    public static void huged( MessageChannel channel, String dedicate, int number, String authorName ) throws IllegalArgumentException{
        String path="src/main/java/com/tk/Reactions/Animations/Hug/";
        String afection="Hug";
        com.tk.Reactions.Reacting.sendMessage(com.tk.Reactions.Reacting.mountMessage("Huged", 
            dedicate, authorName, number), 
            com.tk.Reactions.Reacting.animateFile(number, path), channel, afection);

    }
}
