package com.tk;

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
            JDABuilder.create("OTcwMDI3Njk0MzY2NTIzNDQz.Ym1-sA.b4jSHPHkTNxybp_BhhThZfIPGOo", GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
            .addEventListeners(new CarenciaBot()).setActivity(Activity.playing("loving ♥!")).build();
        } catch (LoginException e) {
            System.out.println("Please, verify the token inserted.");
        }

    }
    
    public void onMessageReceived(MessageReceivedEvent event) {
        Message  msg = event.getMessage();

        String message =msg.getContentRaw();

        String action = com.tk.Algoritimo.ServicesOnMsg.shorC(message);

        if(action.equals("C.") || action.equals("c.")){
            MessageChannel channel = event.getChannel();
            action = com.tk.Algoritimo.ServicesOnMsg.cutAction(message + " ");
            try {
                if(action.equals("kiss")){
                    byte imagesSaved = 30; //this number is equals the .gif inside in Kiss folder.
                    com.tk.Reactions.Kissus.kiss(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }
                else if(action.equals("hug")){
                    byte imagesSaved =2;
                    com.tk.Reactions.Hug.huged(channel,
                        com.tk.Algoritimo.ServicesOnMsg.acariciaoString(msg.getMentionedUsers().toString()),
                        com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 
                        imagesSaved), msg.getAuthor().getAsMention());
                }   
            }catch(IllegalArgumentException e){
                System.out.println("IllegalArgumentException, verify if imageSaved equals quantity than files saved in your respective folder.");
            }
        }
    }
}
