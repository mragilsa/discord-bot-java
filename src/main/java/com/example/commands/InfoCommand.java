package com.example.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.awt.*;

public class InfoCommand implements Command {
    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescription() {
        return "Display information about the bot.";
    }

    @Override
    public void executeSlash(SlashCommandInteractionEvent event) {
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Bot Information");
        embedBuilder.setDescription("This is a simple Discord bot.");
        embedBuilder.setColor(new Color(10, 0, 211));
        embedBuilder.addField("Author", "Ragil", false);
        embedBuilder.addField("Language", "Java", false);
        embedBuilder.addField("Library", "JDA (Java Discord API)", true);

        MessageEmbed embed = embedBuilder.build();
        event.replyEmbeds(embed).queue();

    }
}
