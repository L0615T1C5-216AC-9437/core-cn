### Description
Core plugin for the CN plugins.  
This plugin allows you to easily modify the settings of CN plugins.

### Usage  
do `help` in server console to get commands, it should tell you what each command does.  

### Building a Jar  

1) fork this repo
2) download src
3) run gradlew.bat
4) go to the plugin folder in cmd. (example: `cd C:\user\one\desk\pluginfolder\`)
5) type `gradlew jar` and execute (`./gradlew jar` on linux)
6) done, look for plugin.jar in `pluginfolder\build\libs\`

Note: Highly recommended to use Java 8.

### Installing

Simply place the output jar from the step above in your server's `config/mods` directory and restart the server.
List your currently installed plugins/mods by running the `mods` command.

### Self Promotion
Our discord server: http://cn-discord.ddns.net  
Our game servers:  
chaotic-neutral.ddns.net:1111  
chaotic-neutral.ddns.net:2222  
