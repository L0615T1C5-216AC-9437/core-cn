package core;

import arc.util.*;
import mindustry.plugin.Plugin;
import org.json.JSONObject;

public class Main extends Plugin {
    String userHomePath = System.getProperty("user.home");
    String location = userHomePath+"/mind_db/";
    @Override
    public void registerServerCommands(CommandHandler handler) {
        handler.register("make","<fileName>", "makes a json.cn with a basic object", arg -> {
            JSONObject object = new JSONObject();
            object.put("Key", "Value");
            Log.info(byteCode.make(arg[0],object));
        });
        handler.register("makedir","<fileName>", "makes a json.cn with a basic object", arg -> {
            Log.info(byteCode.mkdir(arg[0]));
        });
        handler.register("get","<fileName>", "gets everything inside the json.cn", arg -> {
            JSONObject data = byteCode.get(arg[0]);
            if (data != null) {
                StringBuilder builder = new StringBuilder();
                builder.append("\n");
                for (String keyStr : data.keySet()) {
                    Object keyvalue = data.get(keyStr);
                    //Print key and value
                    builder.append(keyStr + " : " + keyvalue).append("\n");
                }
                Log.info(builder.toString());
            }
        });
        handler.register("putstr","<fileName> <key> <value>", "puts a string in into the json.cn", arg -> {
            Log.info(byteCode.putStr(arg[0], arg[1], arg[2]));
        });
        handler.register("putint", "<fileName> <key> <value>", "puts a integer in into the json.cn", arg -> {
            int i = Strings.parseInt(arg[2]);
            Log.info(byteCode.putInt(arg[0], arg[1], i));
        });
        handler.register("remove","<fileName> <key>", "removes a key from the json file", arg -> {
            Log.info(byteCode.remove(arg[0], arg[1]));
        });
        handler.register("has","<fileName>", "checks that a file exists", arg -> {
            Log.info("Has `" + location + arg[0] + ".cn` : " + byteCode.has(arg[0]));
        });
        handler.register("hasdir","<fileName>", "checks that a directory exists", arg -> {
            Log.info("Has `" + userHomePath+"/"+arg[0] + "/` : " + byteCode.hasDir(arg[0]));
        });
    }
}