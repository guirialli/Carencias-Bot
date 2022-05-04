package com.tk.Reactions;
import net.dv8tion.jda.api.entities.MessageChannel;


public class Kissus {
    public static void kiss( MessageChannel channel, String dedicate, int number, String authorName ) throws IllegalArgumentException{
        String path = "src/main/java/com/tk/Reactions/Animations/Kiss/";

        com.tk.Reactions.Reacting.sendMessage(com.tk.Reactions.Reacting.mountMessage("Kissed", dedicate, authorName, number), com.tk.Reactions.Reacting.animateFile(number, path), channel);
    }

}
