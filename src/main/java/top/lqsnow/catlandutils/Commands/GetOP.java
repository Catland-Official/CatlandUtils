package top.lqsnow.catlandutils.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetOP implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("§e你的op被黑客猫猫劫持了，黑客猫猫让你发出了一声猫叫。");
        player.chat("喵呜~ O.o");
        player.performCommand("crawl");
        return true;
    }
}
