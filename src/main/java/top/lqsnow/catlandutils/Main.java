package top.lqsnow.catlandutils;

import org.bukkit.plugin.java.JavaPlugin;
import top.lqsnow.catlandutils.Commands.GetOP;
import top.lqsnow.catlandutils.Commands.GetRandomTemplate;
import top.lqsnow.catlandutils.Commands.Menu;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("getop").setExecutor(new GetOP());
        getCommand("menu").setExecutor(new Menu());
        getCommand("getrandomtemplate").setExecutor(new GetRandomTemplate());
    }

}
