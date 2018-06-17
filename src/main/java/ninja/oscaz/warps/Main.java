package ninja.oscaz.warps;

import org.bukkit.plugin.java.JavaPlugin;

import ninja.oscaz.warps.command.WarpCommand;

public class Main extends JavaPlugin {

    private final DatabaseManager manager = new DatabaseManager(this);

    @Override
    public void onEnable() {
        this.getCommand("warp").setExecutor(new WarpCommand());
    }

    @Override
    public void onDisable() {

    }

}
