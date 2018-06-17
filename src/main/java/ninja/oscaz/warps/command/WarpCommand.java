package ninja.oscaz.warps.command;

import org.bukkit.command.CommandSender;

import co.insou.commands.CommandConsumer;

public class WarpCommand extends CommandConsumer {

    public WarpCommand() {
        super("warp", true);
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        if (args.length == 0) {

        }
        if (args[0].equalsIgnoreCase("add")) {

        }
    }

}
