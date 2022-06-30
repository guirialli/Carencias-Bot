package com.tk;



import javax.security.auth.login.LoginException;


import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
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
            String action = com.tk.Algoritimo.ServicesOnMsg.shorC(message, 2);

            if(action.equals("c.")){
                com.tk.Carencia.AfectionSelect.selector(event, message, msg);               
            }
            else{
                action = com.tk.Algoritimo.ServicesOnMsg.shorC(message, 1);
                if(action.equals("?")){
                    com.tk.Dice.RollDice.roll(message, event.getChannel());
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("IllegalArgumentException, verify if imageSaved equals quantity than files saved in your respective folder.");} catch( Exception e){
        }
        
        
    }
}
