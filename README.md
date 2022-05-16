# Carencias-Bot

This a simple bot code make with jda, this function is send love in your server ❤️.

Look at the source code and implement your new bot, just placing your gifs in the respective folders.
If you want to create new categories, just follow the ready-made templates.

if u don't want to have work, just add our bot on your server:
[Carencia Bot ❤️](https://discord.com/oauth2/authorize?client_id=970027694366523443&scope=bot&permissions=19472)


### Help✨
Example: "C.kiss @Cute #20".

The master key is "C.", with it the bot understands that the command is for him.

- `C.kiss`, he sent kisses in the form of gifs 😘.

- `C.hug`, animated hugs 🤗.

- `C.pat`, cafune 😻.

- `C.slap`, slap your friend 😂.

- `C.spank`, spank the butt 😢.

You can easily tag your friends.

The "#", is optional, only use it if you want to select a specific gif.


### Configurations 📝

In the CarenciaBot.java, you will find this:

```Java
  public static void main(String[] args)  {

        try {
            JDABuilder.create("TOKEN", GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
            .addEventListeners(new CarenciaBot()).setActivity(Activity.playing("loving ♥!")).build();
        } catch (LoginException e) {
            System.out.println("Please, verify the token inserted.");
        }

    }
``` 
- Exchange "Token" for your bot's token.
- In "setActivity" change for status you want.
- If insert a incorret token, this message will be displayded: "Please, verify the token inserted."

Insert into "Animatons" your gifs. If you want to implement new functions, analyze the source code and deploy.
