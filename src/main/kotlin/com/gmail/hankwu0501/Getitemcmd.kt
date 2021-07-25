package com.gmail.hankwu0501

import com.gmail.hankwu0501.command.Command
import org.bukkit.plugin.java.JavaPlugin

class Getitemcmd: JavaPlugin() {
    override fun onEnable() {
        println("§2插件啟動成功")
        getCommand("getitemcmd")?.setExecutor(Command())
    }
}