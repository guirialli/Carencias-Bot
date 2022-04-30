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
    


    public static void main(String[] args) throws LoginException {
        JDABuilder.create("OTcwMDI3Njk0MzY2NTIzNDQz.Ym1-sA.cwSBc81E4s2dxbKAdtcGhPeUHuQ", GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
        .addEventListeners(new CarenciaBot()).setActivity(Activity.playing("loving ♥!")).build();
    }
    
    public void onMessageReceived(MessageReceivedEvent event) {
        Message  msg = event.getMessage();

        String message =msg.getContentRaw();

        String action = com.tk.Algoritimo.ServicesOnMsg.shorC(message);

        if(action.equals("C.") || action.equals("c.")){
            MessageChannel channel = event.getChannel();
            action = com.tk.Algoritimo.ServicesOnMsg.cutAction(message + " ");

            if(action.equals("kiss")){
                int number = com.tk.Algoritimo.ServicesOnMsg.cutINT(message, 2);
                System.out.println(msg.getAuthor().getAsMention());
                com.tk.Reactions.Kiss.kiss(channel, action,msg.getMentionedUsersBag().toString(), number, msg.getAuthor().getAsMention());
            }
        }
    }
}
