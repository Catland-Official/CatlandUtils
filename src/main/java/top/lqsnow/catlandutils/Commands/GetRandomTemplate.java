package top.lqsnow.catlandutils.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GetRandomTemplate implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.hasPermission("catlandutils.getrandomtemplate")) {
                player.sendMessage(ChatColor.RED + "你没有使用此命令的权限");
                return true;
            }
        }

        int num = Integer.parseInt(args[1]);
        for (int i = 0; i < num; i++) {
            givePlayer(Bukkit.getPlayer(args[0]));
        }

        return true;
    }

    private void givePlayer(Player player) {
        Random random = new Random();
        int temp_id = random.nextInt( 17);
        List<String> list = Arrays.asList(
                "netherite_upgrade_smithing_template",
                "coast_armor_trim_smithing_template",
                "dune_armor_trim_smithing_template",
                "eye_armor_trim_smithing_template",
                "host_armor_trim_smithing_template",
                "raiser_armor_trim_smithing_template",
                "rib_armor_trim_smithing_template",
                "sentry_armor_trim_smithing_template",
                "shaper_armor_trim_smithing_template",
                "silence_armor_trim_smithing_template",
                "snout_armor_trim_smithing_template",
                "spire_armor_trim_smithing_template",
                "tide_armor_trim_smithing_template",
                "vex_armor_trim_smithing_template",
                "ward_armor_trim_smithing_template",
                "wayfinder_armor_trim_smithing_template",
                "wild_armor_trim_smithing_template"
        );
        Material item = Material.valueOf(list.get(temp_id).toUpperCase());
        ItemStack itemStack = new ItemStack(item);
        player.getInventory().addItem(itemStack);
    }
}
