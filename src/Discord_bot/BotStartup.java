package Discord_bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;

public class BotStartup {
    public static void main(String[] args) throws LoginException {
        JDABuilder jda = JDABuilder.createDefault("OTI5MjIyMTIxMjQ1Mjc4MjQ4.YdkLiQ.h41Tx6S7yqLltTNVAutuxtfNFms");
        jda.setActivity(Activity.watching("Your mom"));
        jda.setStatus(OnlineStatus.ONLINE); //can set it to DO NOTDISTURB, IDLE, OFFLINE, INVISIBLE. Setting to invisible or offline is a bad idea
        jda.addEventListeners(new Commands("!"));
        jda.setChunkingFilter(ChunkingFilter.ALL); //allow you to see all the members in the discord server
        jda.setMemberCachePolicy(MemberCachePolicy.ALL);
        jda.enableIntents(GatewayIntent.GUILD_MEMBERS);//gives permissions to view members
        jda.build();
    }
}