package com.tk;

import java.io.File;
import java.util.Arrays;

import javax.security.auth.login.LoginException;


import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;



public class CarenciaBot extends ListenerAdapter {
    


    public static void main(String[] args)  {

        try {
            JDABuilder.create("TOKEN", GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
            .addEventListeners(new CarenciaBot()).setActivity(Activity.playing("loving ♥!")).build();
        } catch (LoginException e) {
            System.out.println("Please, verify the token inserted.");
        }

    }
    
    public void onMessageReceived(MessageReceivedEvent event) {
        Message  msg = event.getMessage();

        try {
            String message =msg.getContentRaw().toLowerCase();
            String action = com.tk.Algoritimo.ServicesOnMsg.shorC(message);

            if(action.equals("c.")){
                MessageChannel channel = event.getChannel();
                File file;
                action = com.tk.Algoritimo.ServicesOnMsg.cutAction(message + " ");


                if(action.equals("kiss")){
                    file = new File("src/main/java/com/tk/Reactions/Animations/Kiss");
                    int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
                    imagesSaved--;
                    com.tk.Reactions.Kissus.kiss(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message , 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
                else if(action.equals("hug")){
                    file = new File("src/main/java/com/tk/Reactions/Animations/Hug");
                    int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
                    imagesSaved--;
                    com.tk.Reactions.Hug.huged(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
                else if(action.equals("lick")){
                    file = new File("src/main/java/com/tk/Reactions/Animations/Lick");
                    int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
                    imagesSaved--;
                    com.tk.Reactions.Lick.licked(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
                else if(action.equals("spank")){
                    file = new File("src/main/java/com/tk/Reactions/Animations/Spank");
                    int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
                    imagesSaved--;                    
                    com.tk.Reactions.Spank.spanked(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
                else if (action.equals("slap")){
                    file = new File("src/main/java/com/tk/Reactions/Animations/Slap");
                    int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
                    imagesSaved--;                    
                    com.tk.Reactions.Slap.slaped(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
                else if (action.equals("pat")){
                    file = new File("src/main/java/com/tk/Reactions/Animations/Pat");
                    int imagesSaved = (int) Arrays.stream(file.listFiles()).filter(f -> f.isFile()).count();
                    imagesSaved--;
                    com.tk.Reactions.Pat.pated(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException, verify if imageSaved equals quantity than files saved in your respective folder.");} catch( Exception e){
        }
        
        
    }
}
