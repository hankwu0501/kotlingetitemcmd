package com.gmail.hankwu0501

import com.gmail.hankwu0501.command.Command
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    override fun onEnable() {
        print("插件啟動成功")
        getCommand("getitemcmd")?.setExecutor(Command)
    }
}