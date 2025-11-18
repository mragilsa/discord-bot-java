# Discord Bot – JDA

A simple Discord bot built with Java and JDA. This project includes basic slash commands, event handling, and a clean modular structure.

## Features
- Slash commands
- Modular command structure
- Event listener system
- Easy token configuration

## Setup

### 1. Clone
```bash
git clone https://github.com/mragilsa/discord-bot-java.git
```
```
cd discord-bot-java
```
Open the project in your preferred IDE to inspect and run the code.

### 2. Discord Bot Setup
- Get a bot token from the [Discord Developer Portal](https://discord.com/developers/applications)
- Create a new application and add a bot user
- Enable necessary intents in the bot settings
- Invite the bot to your server using the OAuth2 URL generator with appropriate scopes (bot, applications.commands)


### 3. Configure Token
Configure your bot token in `src/main/resources/config.properties`:
```
botToken=your_bot_token_here
```

### 4. Build & Run
```
mvn clean package
```
```
java -jar target/discord-bot-1.0-SNAPSHOT-jar-with-dependencies.jar
```

After the bot is running, open Discord and navigate to the server where you added the bot. You can now use the slash commands listed below to interact with the bot.

## Commands
- `/ping` – Checks the bot's latency to Discord's gateway
- `/info` – Displays information about the bot
- `/echo [text]` –  Responds back with your message

