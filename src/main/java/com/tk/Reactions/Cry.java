package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Cry extends ReactingServices {

    public static void cry(MessageChannel channel, String dedicate, int number, String authorName ){
        String path = "Animations/Cry";
        String afection="Cry, Cry with a baby";
        com.tk.Reactions.ReactingServices.sendMessage(
            com.tk.Reactions.ReactingServices.mountMessage("Cryng because", 
            dedicate, authorName, number), 
            com.tk.Reactions.ReactingServices.animateFile(number, path), channel, afection);
    }
}
