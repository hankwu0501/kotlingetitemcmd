package com.gmail.hankwu0501.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Command : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String?>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("§c你不是一位玩家!")
            return false
        }
        if (!sender.hasPermission("getitemcmd.commands")) {
            sender.sendMessage("§c你沒有權限使用此指令")
            return false

        }

        val cmd: String = if (sender.inventory.itemInMainHand.itemMeta?.hasCustomModelData() == false) {
            "無"
        }else{
            sender.inventory.itemInMainHand.itemMeta?.customModelData.toString()
        }

        val item = sender.inventory.itemInMainHand.type.toString()
        sender.sendMessage("你手上的物品為: $item, CustomModelData : $cmd")

        return true
    }
}