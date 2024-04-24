package com.jesse.singleslotrandomizer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SingleSlotRandomizer extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().broadcastMessage("[SSR] SingleSlotRandomizer is enabled!");
    }
}
