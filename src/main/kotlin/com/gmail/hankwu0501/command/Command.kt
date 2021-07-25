package com.gmail.hankwu0501.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object Command : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String?>): Boolean {
        if (sender is Player) {
            if (sender.hasPermission("getitemcmd.commands")) {
                val iteminfo = sender.inventory.itemInMainHand
                sender.sendMessage(iteminfo.toString())
                return true
            }else {
                sender.sendMessage("§c你沒有權限使用此指令")
                return false
            }
        }else{
            sender.sendMessage("§c你不是一位玩家!")
            return false
        }
    }
}