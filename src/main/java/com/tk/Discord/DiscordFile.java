package com.tk.Discord;

import java.io.File;

public class DiscordFile {
    public static File animateFile(int number, String caminho) throws IllegalArgumentException{
        StringBuilder builder = new StringBuilder();
        builder.append(caminho + Integer.toString(number) +".gif");
        return new File(builder.toString());    
    }
}
