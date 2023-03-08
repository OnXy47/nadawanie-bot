
package onxy.xd.bot;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
public class Main {
    public static void main(String[] args2) {
        JDABuilder.createDefault("token").addEventListeners(new NadajCommand()).setActivity(Activity.listening("by onxy")).enableIntents(GatewayIntent.MESSAGE_CONTENT, new GatewayIntent[0]).build();


    }
}

