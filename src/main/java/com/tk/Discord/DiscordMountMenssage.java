package com.tk.Discord;

public class DiscordMountMenssage {
    public static String mountMessage(String  action, String dedicate, String authorName, int number ){

        StringBuilder builder = new StringBuilder();
        builder.append(authorName);
        builder.append(" **" + action +"** ");
        if(!dedicate.isEmpty())
            builder.append("<@" + dedicate + "> ");
        builder.append("**#"+number + "**");
        return builder.toString();
    }
}
