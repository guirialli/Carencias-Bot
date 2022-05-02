package com.tk.Reactions;

import net.dv8tion.jda.api.entities.MessageChannel;

public class Kiss extends Reacting{
    
    public static void kiss( MessageChannel channel, String dedicate, int number, String authorName ){
        String caminho = "src/main/java/com/tk/Reactions/Animations/Kiss/";

        sendMessage(mountMessage("Kissed", dedicate, authorName, number), animateFile(number, caminho), channel);
    }


}
