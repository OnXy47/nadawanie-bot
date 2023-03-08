
package onxy.xd.bot;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class NadajCommand
        extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] args2;
        if (event == null) {
            NadajCommand.$$$reportNull$$$0(0);
        }
        if ((args2 = event.getMessage().getContentRaw().split(" "))[0].equalsIgnoreCase("$nadaj")) {

            if (args2.length < 3) {
                EmbedBuilder builder = new EmbedBuilder();
                builder.setColor(Color.RED.getRGB());
                builder.setTitle("Niepoprawne użycie komendy!");
                builder.addField("Poprawne użycie:","$nadaj typ nick id",true);
                builder.setAuthor(event.getAuthor().getName(), event.getAuthor().getAvatarUrl(), event.getAuthor().getAvatarUrl());
                event.getChannel().sendMessageEmbeds(builder.build(), new MessageEmbed[0]).queue();
                return;
            }



                    EmbedBuilder builder = new EmbedBuilder();
                    builder.setColor(Color.ORANGE.getRGB());

                try {
                    Scanner scanner = new Scanner(new URL("http://twojadomena.ok/xd/wings.php?key=klucz1&typ="+args2[1]+"&nick="+args2[2]+"&id="+args2[3]+"&time=10-10-2029").openStream());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                    builder.setTitle("Poprawnie nadales kosmetyk!");
                    builder.addField("Typ: " + args2[1], "", true);
                    builder.addField("ID: " + args2[3], "", true);
                    builder.setAuthor("Nadano!", "https://minotar.net/avatar/" + args2[2] + ".png", "https://minotar.net/avatar/" + args2[2] + ".png");
                    builder.setFooter(event.getAuthor().getName(), event.getAuthor().getAvatarUrl());
                    event.getChannel().sendMessageEmbeds(builder.build(), new MessageEmbed[0]).queue();
                    return;
                }

        }



    private static /* synthetic */ void $$$reportNull$$$0(int n) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "event", "onxy/xd/bot/NadajCommand", "onMessageReceived"));
    }
}

